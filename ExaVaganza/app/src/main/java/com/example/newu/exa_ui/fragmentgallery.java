package com.example.newu.exa_ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 08/03/2018.
 */

public class fragmentgallery extends Fragment {

    List<Book> listbook;
    RecyclerView myrv;
    View v;

    public fragmentgallery() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.mygallery, container, false);
        return v;
    }


    @Override
    public void onStart() {
        super.onStart();

        listbook = new ArrayList<>();
        listbook.add(new Book("A", "Category Book", "Description book", R.drawable.vegetariancover));
        listbook.add(new Book("B", "Category Book", "Description book", R.drawable.asdasd));
        listbook.add(new Book("C", "Category Book", "Description book", R.drawable.dfvdfv));
        listbook.add(new Book("D", "Category Book", "Description book", R.drawable.ertrg));
        listbook.add(new Book("E", "Category Book", "Description book", R.drawable.images));
        listbook.add(new Book("F", "Category Book", "Description book", R.drawable.index));
        listbook.add(new Book("G", "Category Book", "Description book", R.drawable.readymade));
        listbook.add(new Book("H", "Category Book", "Description book", R.drawable.sdfasd));
        listbook.add(new Book("I", "Category Book", "Description book", R.drawable.va));
        listbook.add(new Book("J", "Category Book", "Description book", R.drawable.we));

        listbook.add(new Book("E", "Category Book", "Description book", R.drawable.images));
        listbook.add(new Book("F", "Category Book", "Description book", R.drawable.index));
        listbook.add(new Book("G", "Category Book", "Description book", R.drawable.readymade));
        listbook.add(new Book("H", "Category Book", "Description book", R.drawable.sdfasd));
        listbook.add(new Book("I", "Category Book", "Description book", R.drawable.va));
        listbook.add(new Book("J", "Category Book", "Description book", R.drawable.we));

        myrv=getView().findViewById(R.id.recycler_id);

        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this.getContext(), listbook);
        myrv.setLayoutManager(new GridLayoutManager(this.getContext(),3));

        myrv.setAdapter(myAdapter);


    }

}

