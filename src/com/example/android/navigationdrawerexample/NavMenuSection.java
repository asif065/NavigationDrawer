package com.example.android.navigationdrawerexample;

public class NavMenuSection implements NavDrawerItem {

	public static final int SECTION_TYPE = 0;
    private int id;
    private String label;

    private NavMenuSection() {
    }
    
    public static NavMenuSection create( int id, String label ) {
        NavMenuSection section = new NavMenuSection();
        section.setLabel(label);
        return section;
    }
    
	public void setLabel(String label) {
		// TODO Auto-generated method stub
		this.label = label;
		
	}
	
	public void setId(int id) {
        this.id = id;
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
		return SECTION_TYPE;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateActionBarTitle() {
		// TODO Auto-generated method stub
		return false;
	}

}
