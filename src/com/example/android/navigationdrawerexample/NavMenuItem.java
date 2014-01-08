package com.example.android.navigationdrawerexample;

import android.content.Context;

public class NavMenuItem implements NavDrawerItem {
	
	public static final int ITEM_TYPE = 1 ;

    private int id ;
    private String label ;  
    private int icon ;
    private boolean updateActionBarTitle ;

    NavMenuItem() {
    }
    
    public static NavMenuItem create( int id, String label, String icon, boolean updateActionBarTitle, Context context ) {
        NavMenuItem item = new NavMenuItem();
        item.setId(id);
        item.setLabel(label);
        item.setIcon(context.getResources().getIdentifier( icon, "drawable", context.getPackageName()));
        item.setUpdateActionBarTitle(updateActionBarTitle);
        return item;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    public void setIcon(int icon) {
        this.icon = icon;
    }
    
    public void setUpdateActionBarTitle(boolean updateActionBarTitle) {
        this.updateActionBarTitle = updateActionBarTitle;
    }
    
    public int getIcon() {
        return icon;
    }
    
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return label;
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return ITEM_TYPE;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateActionBarTitle() {
		// TODO Auto-generated method stub
		return this.updateActionBarTitle;
	}

}
