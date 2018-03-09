package com.example.newu.exa_ui;

import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 08/03/2018.
 */

public class fragmentpending extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    View v;
    public fragmentpending() {

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.new_space,container,false);
        // inflator sets the UI of fragment to new_space

        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = getView().findViewById(R.id.recyclerview);
    }

    @Override
    public void onStart() {
        super.onStart();


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        listItems = new ArrayList<>();

        for(int i = 0;i<=10;i++){
            ListItem listItem = new ListItem(
                    "heading" + (i+1),
                    "Loren Ipsum Dummy Test"
            );
            listItems.add(listItem);
        }

        adapter = new MyAdapter(listItems, this.getActivity());
        recyclerView.setAdapter(adapter);
    }


}



