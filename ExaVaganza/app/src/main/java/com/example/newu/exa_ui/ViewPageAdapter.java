package com.example.newu.exa_ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nEW u on 08/03/2018.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> listfragment=new ArrayList<>();
    private final List<String> listtitles=new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return listfragment.get(position);
    }

    @Override
    public int getCount() {
        return listtitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listtitles.get(position);
    }

    public void addFragment(Fragment fragment, String title){

        listfragment.add(fragment);
        listtitles.add(title);

    }


}
