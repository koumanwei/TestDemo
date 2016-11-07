package com.koumanwei.testdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.koumanwei.testdemo.R;

/**
 * 这是是借助ListView的条目是否可见来进行悬浮的，实现比较简单，
 * 但是局限性比较大，仅仅适用于ListView
 */
public class FloatActivity extends AppCompatActivity {
    /**
     * 悬浮部分的容器
     */
    private LinearLayout llFloat;
    /**
     * 展示数据的listview
     */
    private ListView listView;
    /**
     * listView头部布局
     */
    private View listViewHeader;
    /**
     * 影藏在头部的悬浮部分
     */
    private View listViewHeaderFloat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float);
        initViews();
        listView.addHeaderView(listViewHeader);
        listView.addHeaderView(listViewHeaderFloat);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{
                "张三", "李四", "王五", "赵六", "田七",
                "张三", "李四", "王五", "赵六", "田七",
                "张三", "李四", "王五", "赵六", "田七",
                "张三", "李四", "王五", "赵六", "田七"
        }));
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (firstVisibleItem >= 1) {
                    llFloat.setVisibility(View.VISIBLE);
                } else {

                    llFloat.setVisibility(View.GONE);
                }
            }
        });
    }

    /**
     * 初始化组件
     */
    private void initViews() {
        llFloat = (LinearLayout) findViewById(R.id.ll_float);
        listView = (ListView) findViewById(R.id.listView);
        listViewHeader = View.inflate(this, R.layout.listview_header, null);
        listViewHeaderFloat = View.inflate(this, R.layout.listview_header_float, null);
    }
}
