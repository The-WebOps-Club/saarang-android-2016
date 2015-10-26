package com.example.kiran.saarang.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.kiran.saarang.Adapters.ViewPagerAdapter;
import com.example.kiran.saarang.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    TextView[] tabs;
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );

        Initializetabs();

        viewpager = (ViewPager) findViewById(R.id.viewpager);
        viewpager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                setTabs(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void Initializetabs() {
        tabs = new TextView[]{(TextView) findViewById(R.id.eventsTab), (TextView) findViewById(R.id.scheduleTab),
                (TextView) findViewById(R.id.proshowsTab), (TextView) findViewById(R.id.menuTab)};
        findViewById(R.id.eventsTab).setOnClickListener(this);
        findViewById(R.id.scheduleTab).setOnClickListener(this);
        findViewById(R.id.proshowsTab).setOnClickListener(this);
        findViewById(R.id.menuTab).setOnClickListener(this);
    }

    private void setTabs(int pos) {
        for (int i = 0; i < tabs.length; i++) {
            tabs[i].setBackgroundColor(getResources().getColor(R.color.mainactivity_tab));
        }
        tabs[pos].setBackgroundColor(getResources().getColor(R.color.mainactivity_tab_selected));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eventsTab:
                setTabs(0);
                viewpager.setCurrentItem(0);
                break;
            case R.id.scheduleTab:
                setTabs(1);
                viewpager.setCurrentItem(1);
                break;
            case R.id.proshowsTab:
                setTabs(2);
                viewpager.setCurrentItem(2);
                break;
            case R.id.menuTab:
                setTabs(3);
                viewpager.setCurrentItem(3);
                break;
        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }
}
