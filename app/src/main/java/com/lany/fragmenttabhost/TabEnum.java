package com.lany.fragmenttabhost;

public enum TabEnum {
    HOME("首页", R.drawable.tab_home, HomeFragment.class),

    TWEET("分类", R.drawable.tab_icon_tweet, BBFragment.class),

    SEARCH("搜索", R.drawable.tab_icon_new, CCFragment.class),

    EXPLORE("特选", R.drawable.tab_icon_explore, DDFragment.class),

    MY("我的", R.drawable.tab_my, MyFragment.class);

    private String name;
    private int icon;
    private Class<?> clz;

    TabEnum(String name, int icon,
            Class<?> clz) {
        this.name = name;
        this.icon = icon;
        this.clz = clz;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public Class<?> getClz() {
        return clz;
    }
}