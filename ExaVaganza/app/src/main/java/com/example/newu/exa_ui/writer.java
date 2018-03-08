package com.example.newu.exa_ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class writer extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writer);


        tabLayout=findViewById(R.id.tab_layoutW);
        viewPager=findViewById(R.id.viewpager_idW);
        adapter=new ViewPageAdapter(getSupportFragmentManager());

        //add fragment

       adapter.addFragment(new fragmentarr(),"ARRIVALS");
        adapter.addFragment(new fragmentwork(),"WORKING");
        adapter.addFragment(new fragmentcreated(),"CREATED");



        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
