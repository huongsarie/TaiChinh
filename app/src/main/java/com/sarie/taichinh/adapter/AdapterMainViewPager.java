package com.sarie.taichinh.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by huongsarie on 30/03/2016.
 */
public class AdapterMainViewPager  extends FragmentPagerAdapter{

    private ArrayList<Fragment> arrFrag;
    private ArrayList<String> arrTitle;

    @Override
    public int getCount() {
        return arrFrag.size();
    }

    @Override
    public Fragment getItem(int position) {
        return arrFrag.get(position);
    }

    public AdapterMainViewPager(FragmentManager manager){
        super(manager);
        arrFrag= new ArrayList<>();
        arrTitle= new ArrayList<>();
    }

    public void addFragment(Fragment fragment, String title){
        arrFrag.add(fragment);
        arrTitle.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return arrTitle.get(position);
    }
}
