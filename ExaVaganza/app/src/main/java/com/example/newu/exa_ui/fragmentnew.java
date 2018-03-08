package com.example.newu.exa_ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nEW u on 08/03/2018.
 */

public class fragmentnew extends Fragment {

    View v;
    public fragmentnew() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.new_space,container,false);
        return v;

    }


}
