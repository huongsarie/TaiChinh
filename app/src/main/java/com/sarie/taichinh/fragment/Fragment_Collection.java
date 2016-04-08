package com.sarie.taichinh.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sarie.taichinh.R;

/**
 * Created by huongsarie on 30/03/2016.
 */
public class Fragment_Collection extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_collection_main,container,false);
        return view;
    }
}
