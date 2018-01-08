package com.example.ahmed.tourguideapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For View Pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        ArrayList<BaseFragment> fragments = new ArrayList<>();

        FirstFragment fragment = new FirstFragment();
        fragment.setTitle("Restaurants");
        fragments.add(fragment);

        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setTitle("Top Attractions");
        fragments.add(secondFragment);

        ThirdFragment thirdFragment = new ThirdFragment();
        thirdFragment.setTitle("Museams");
        fragments.add(thirdFragment);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(pagerAdapter);

    }


    //For Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.exit:
                System.exit(0);
                break;
        }
        return true;
    }

}
