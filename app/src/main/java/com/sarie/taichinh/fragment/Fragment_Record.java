package com.sarie.taichinh.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.sarie.taichinh.R;

/**
 * Created by huongsarie on 06/04/2016.
 */
public class Fragment_Record extends Fragment {

    private Context context;
    private View view;
    private TabLayout tablayout;
    private FrameLayout frameLayout;
    private Fragment_Expense frag_Exp,frag_3;
    private Fragment_Statistic frag_2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_record_main,container,false);
        init(view);
        return view;
    }

    private void init(View view){
        frag_Exp = new Fragment_Expense();
        frag_2= new Fragment_Statistic();
        frag_3=new Fragment_Expense();

        frameLayout=(FrameLayout) view.findViewById(R.id.framelayout_record);

        tablayout=(TabLayout) view.findViewById(R.id.tablayout_ghichep);
        tablayout.addTab(tablayout.newTab().setText(getResources().getString(R.string.tab_expense)));
        tablayout.addTab(tablayout.newTab().setText(getResources().getString(R.string.tab_debt)));
        tablayout.addTab(tablayout.newTab().setText(getResources().getString(R.string.tab_loan)));
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        replaceFragment(frag_Exp);
                        break;
                    case 1:
                        replaceFragment(frag_2);
                        break;
                    case 2:
                        replaceFragment(frag_3);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fManager= this.getChildFragmentManager();
        FragmentTransaction transaction=fManager.beginTransaction();
        transaction.replace(R.id.framelayout_record,fragment);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.commit();
    }

}
