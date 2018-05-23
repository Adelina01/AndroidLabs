package com.example.adelina.lab2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Adelina on 05.05.2018.
 */

public class OneFragment extends Fragment {

    public final static String TAG = "OneFragmentTag";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.one_fragment, null);
    }
}
