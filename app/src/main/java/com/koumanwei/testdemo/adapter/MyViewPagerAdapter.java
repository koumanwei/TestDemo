package com.koumanwei.testdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by koumanwei on 2016/10/28.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    /**
     * 页卡标题集合
     */
    private List<String> tabTitleList;
    /**
     * fragment集合
     */
    private List<Fragment> fragmentList;

    public MyViewPagerAdapter(FragmentManager fm, List<String> tabTitleList, List<Fragment> fragmentList) {
        super(fm);
        this.tabTitleList = tabTitleList;
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return tabTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitleList.get(position);
    }
}
