package com.example.android.navigationdrawerexample;

import android.os.Bundle;

public class YourAppMainActivity extends AbstractNavDrawerActivity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ( savedInstanceState == null ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();
        }
    }
    
    @Override
    protected NavDrawerActivityConfiguration getNavDrawerConfiguration() {
        
        NavDrawerItem[] menu = new NavDrawerItem[] {
                NavMenuSection.create( 100, "Physical Data"),
                NavMenuItem.create(101,"Body Mass Index", "navdrawer_friends", true, this),
                NavMenuItem.create(102, "Airport (AsyncTask)", "navdrawer_airport", true, this), 
                NavMenuSection.create(200, "General"),
                NavMenuItem.create(202, "Rate this app", "navdrawer_rating", true, this),
                NavMenuItem.create(203, "Eula", "navdrawer_eula", true, this), 
                NavMenuItem.create(204, "Quit", "navdrawer_quit", true, this)};
        
        NavDrawerActivityConfiguration navDrawerActivityConfiguration = new NavDrawerActivityConfiguration();
        navDrawerActivityConfiguration.setMainLayout(R.layout.main);
        navDrawerActivityConfiguration.setDrawerLayoutId(R.id.drawer_layout);
        navDrawerActivityConfiguration.setLeftDrawerId(R.id.left_drawer);
        navDrawerActivityConfiguration.setNavItems(menu);
        navDrawerActivityConfiguration.setDrawerShadow(R.drawable.drawer_shadow);       
        navDrawerActivityConfiguration.setDrawerOpenDesc(R.string.drawer_open);
        navDrawerActivityConfiguration.setDrawerCloseDesc(R.string.drawer_close);
        navDrawerActivityConfiguration.setBaseAdapter(
            new NavDrawerAdapter(this, R.layout.navdrawer_item, menu ));
        return navDrawerActivityConfiguration;
    }
    
    @Override
    protected void onNavItemSelected(int id) {
        switch ((int)id) {
        case 101:
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new FriendMainFragment()).commit();
            break;
        case 102:
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new AirportFragment()).commit();
            break;
        }
    }
}