package com.example.svaswani.pink_planet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class PinkPlanetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pink_planet);

        // set up toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set up viewpager with child fragments (swipe tabs)
        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        // add fragments to viewPager
        viewPagerAdapter.addFragment(new ProfileFragment(), "Profile");
        viewPagerAdapter.addFragment(new MessagesFragment(), "Messages");
        viewPager.setAdapter(viewPagerAdapter);

        // tab layout which displays the swipe tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager); //Links the tabs to the views.
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                // tells the viewPager to navigate to the position of the selected tab.
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
        });

    }

}

/**
 * This adapter serves fragments to the ViewPager to display when
 * each tab on the toolbar is activated.
 */
class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    /**
     * Adds a fragment to this ViewPager adapter to display on the ViewPager.
     *
     * @param fragment The fragment to add.
     * @param title    The title of the fragment to display in the TabLayout
     */
    public void addFragment(Fragment fragment, String title) {
        if (fragment == null || title == null) {
            throw new NullPointerException("Fragment or fragment title is null.");
        }
        mFragmentList.add(fragment);
        mFragmentTitles.add(title);
    }
}
