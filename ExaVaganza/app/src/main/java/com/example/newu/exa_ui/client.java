package com.example.newu.exa_ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class client extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        tabLayout=findViewById(R.id.tab_layoutC);
        viewPager=findViewById(R.id.viewpager_idC);
        adapter=new ViewPageAdapter(getSupportFragmentManager());

        //add fragment

        adapter.addFragment(new fragmentnew(),"NEW");
        adapter.addFragment(new fragmentgallery(),"MY GALLERY");
        adapter.addFragment(new fragmentpending(),"PENDING");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
