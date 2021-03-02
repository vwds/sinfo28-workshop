package com.vwds.sinfo28.pages.root;

public class RootPage {
    public final String catImgPath;
    public final String catName;
    public final int catId;
    public final boolean isDark;

    public RootPage(int previousCatId, boolean isDark) {
        this.catId = RootPage.getCatId(previousCatId);
        this.isDark = isDark;
        // TIP: first implement inline so we can refactor
        this.catName = this.getCatName();
        this.catImgPath = this.getImgPath();
    }

    private String getImgPath() {
        return String.format("assets/cats/%scat-%s.jpg", isDark ? "dark-" : "", catId);
    }

    private String getCatName() {
        return String.format("Cat Name %s", catId);
    }

    private static int getCatId(int catId) {
        return catId + 1; // TODO: limit number of catIds
    }
}