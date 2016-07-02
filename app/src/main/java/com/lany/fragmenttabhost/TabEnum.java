package com.lany.fragmenttabhost;

public enum TabEnum {
    HOME("Home", R.drawable.tab_home, HomeFragment.class),

    TWEET("Category", R.drawable.tab_cate, CateFragment.class),

    MY("My", R.drawable.tab_my, MyFragment.class);

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