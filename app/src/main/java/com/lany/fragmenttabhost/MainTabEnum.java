package com.lany.fragmenttabhost;

public enum MainTabEnum {
	NEWS(0, "首页", R.drawable.tab_icon_new, AAFragment.class),

	TWEET(1, "分类", R.drawable.tab_icon_tweet, BBFragment.class),

	QUICK(2, "搜索", R.drawable.tab_icon_new, CCFragment.class),

	EXPLORE(3, "特选", R.drawable.tab_icon_explore, DDFragment.class),

	ME(4, "我的", R.drawable.tab_icon_me, EEFragment.class);

	private int menuIndex;
	private String menuName;
	private int menuIcon;
	private Class<?> clz;

	private MainTabEnum(int menuIndex, String menuName, int menuIcon,
			Class<?> clz) {
		this.menuIndex = menuIndex;
		this.menuName = menuName;
		this.menuIcon = menuIcon;
		this.clz = clz;
	}

	public int getMenuIndex() {
		return menuIndex;
	}

	public void setMenuIndex(int menuIndex) {
		this.menuIndex = menuIndex;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(int menuIcon) {
		this.menuIcon = menuIcon;
	}

	public Class<?> getClz() {
		return clz;
	}

	public void setClz(Class<?> clz) {
		this.clz = clz;
	}

}