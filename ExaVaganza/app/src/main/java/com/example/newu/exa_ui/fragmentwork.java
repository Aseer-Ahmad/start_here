package com.example.newu.exa_ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nEW u on 09/03/2018.
 */

public class fragmentwork extends Fragment{
    View v;
    public fragmentwork() {
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.working,container,false);
        return v;
    }
}
