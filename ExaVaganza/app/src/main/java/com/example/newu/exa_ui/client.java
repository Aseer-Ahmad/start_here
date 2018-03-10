package com.example.newu.exa_ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;





public class client extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;
    DrawerLayout dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        Toolbar tb=findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        dr=findViewById(R.id.dr1);
        ActionBarDrawerToggle tr=new ActionBarDrawerToggle(this,dr,tb,R.string.open,R.string.close);
        dr.addDrawerListener(tr);
        tr.syncState();
        NavigationView nv=findViewById(R.id.navidrawer);
        tabLayout=findViewById(R.id.tab_layoutC);
        viewPager=findViewById(R.id.viewpager_idC);
        adapter=new ViewPageAdapter(getSupportFragmentManager());

        //add fragment

        adapter.addFragment(new fragmentnew(),"NEW");
        adapter.addFragment(new fragmentgallery(),"MY GALLERY");
        adapter.addFragment(new fragmentpending(),"PENDING");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int i=item.getItemId();
                if(i==R.id.wr)
                    Log.e("mainActivity","Writups");
                else if(i==R.id.cl)
                    Log.e("mainActivity","Clients");

                dr.closeDrawers();


                return  true;
            }
        });




    }

    private void setActionBar(Toolbar tb) {

    }
}
