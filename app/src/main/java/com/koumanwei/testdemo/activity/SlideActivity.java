package com.koumanwei.testdemo.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.koumanwei.testdemo.R;
import com.koumanwei.testdemo.adapter.MyViewPagerAdapter;
import com.koumanwei.testdemo.fragment.AllFragment;
import com.koumanwei.testdemo.fragment.CommentFragment;
import com.koumanwei.testdemo.fragment.PayFragment;
import com.koumanwei.testdemo.fragment.ServerFragment;
import com.koumanwei.testdemo.fragment.ServicingFragment;

import java.util.ArrayList;
import java.util.List;

public class SlideActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    /**
     * 页卡标题集合
     */
    private List<String> tabTitleList = new ArrayList<>();
    /**
     * fragment集合
     */
    private List<Fragment> fragmentList = new ArrayList<>();

    private AllFragment allFragment;
    private CommentFragment commentFragment;
    private PayFragment payFragment;
    private ServerFragment serverFragment;
    private ServicingFragment serveringFragment;
    private FragmentPagerAdapter fragmentPagerAdapter;
    private FragmentManager supportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        supportFragmentManager = getSupportFragmentManager();
        initViews();
        initFragment();
    }

    private void initFragment() {

        allFragment = new AllFragment();
        commentFragment = new CommentFragment();
        payFragment = new PayFragment();
        serverFragment = new ServerFragment();
        serveringFragment = new ServicingFragment();

        fragmentList.add(allFragment);
        fragmentList.add(commentFragment);
        fragmentList.add(payFragment);
        fragmentList.add(serverFragment);
        fragmentList.add(serveringFragment);

        tabTitleList.add("全部");
        tabTitleList.add("待评价");
        tabTitleList.add("代付款");
        tabTitleList.add("待服务");
        tabTitleList.add("服务中");

        // 添加tab名称
        tabLayout.addTab(tabLayout.newTab().setText(tabTitleList.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(tabTitleList.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(tabTitleList.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(tabTitleList.get(3)));
        tabLayout.addTab(tabLayout.newTab().setText(tabTitleList.get(4)));

        fragmentPagerAdapter = new MyViewPagerAdapter(supportFragmentManager, tabTitleList, fragmentList);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initViews() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
    }
}
