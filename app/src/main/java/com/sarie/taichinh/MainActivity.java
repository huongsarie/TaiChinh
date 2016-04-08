package com.sarie.taichinh;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sarie.taichinh.adapter.AdapterMainViewPager;
import com.sarie.taichinh.fragment.Fragment_Collection;
import com.sarie.taichinh.fragment.Fragment_Expense;
import com.sarie.taichinh.fragment.Fragment_More;
import com.sarie.taichinh.fragment.Fragment_Record;
import com.sarie.taichinh.fragment.Fragment_Statistic;

public class MainActivity extends AppCompatActivity{

    private Context context;
    private Toolbar toolbar;
    private ViewPager viewpager;
    private TabLayout tablayout;
    private AdapterMainViewPager adapterViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context= MainActivity.this;
        init();
    }

    private void init(){
        toolbar=(Toolbar)findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        viewpager=(ViewPager)findViewById(R.id.main_view_pager);
        setupViewPager(viewpager);
        tablayout=(TabLayout)findViewById(R.id.main_tabLayout);
        tablayout.setupWithViewPager(viewpager);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setupViewPager(ViewPager viewpager){
        adapterViewPager= new AdapterMainViewPager(this.getSupportFragmentManager());
        adapterViewPager.addFragment(new Fragment_Collection(),getResources().getString(R.string.tab_expense));
        adapterViewPager.addFragment(new Fragment_Record(),getResources().getString(R.string.tab_record));
        adapterViewPager.addFragment(new Fragment_Statistic(),getResources().getString(R.string.tab_statistic));
        adapterViewPager.addFragment(new Fragment_More(),getResources().getString(R.string.tab_more));
                viewpager.setAdapter(adapterViewPager);
    }


}
