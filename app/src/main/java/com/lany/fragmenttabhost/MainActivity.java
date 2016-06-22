package com.lany.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        OnTouchListener {
    private FragmentStateTabHost mTabHost;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTabHost = (FragmentStateTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.main_tab_content);
        mTabHost.getTabWidget().setDividerDrawable(null);
        TabEnum[] tabs = TabEnum.values();
        final int size = tabs.length;
        for (int i = 0; i < size; i++) {
            TabEnum item = tabs[i];
            TabSpec tab = mTabHost.newTabSpec(item.getName());
            View indicator = LayoutInflater.from(this).inflate(
                    R.layout.tab_indicator, null);
            TextView title = (TextView) indicator.findViewById(R.id.main_tab_title);
            ImageView logo = (ImageView) indicator.findViewById(R.id.main_tab_logo);
            logo.setBackgroundResource(item.getIcon());
            title.setText(item.getName());
            tab.setIndicator(indicator);
            tab.setContent(new TabContentFactory() {

                @Override
                public View createTabContent(String tag) {
                    return new View(MainActivity.this);
                }
            });
            mTabHost.addTab(tab, item.getClz(), null);
            mTabHost.getTabWidget().getChildAt(i).setOnTouchListener(this);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        boolean consumed = false;
        if (event.getAction() == MotionEvent.ACTION_DOWN
                && v.equals(mTabHost.getCurrentTabView())) {
            Fragment currentFragment = getCurrentFragment();
            if (currentFragment != null
                    && currentFragment instanceof OnTabReselectListener) {
                OnTabReselectListener listener = (OnTabReselectListener) currentFragment;
                listener.onTabReselect();
                consumed = true;
            }
        }
        return consumed;
    }

    private Fragment getCurrentFragment() {
        return getSupportFragmentManager().findFragmentByTag(
                mTabHost.getCurrentTabTag());
    }
}
