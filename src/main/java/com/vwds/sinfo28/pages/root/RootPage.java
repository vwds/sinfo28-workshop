package com.vwds.sinfo28.pages.root;

public class RootPage {
    public final String catImgPath;
    public final String catName;
    public final boolean isDark;

    public RootPage(boolean isDark) {
        this.isDark = isDark;
        // TIP: first implement inline so we can refactor
        this.catName = this.getCatName();
        this.catImgPath = this.getImgPath();
    }

    private String getImgPath() {
        return isDark ? "assets/cats/dark-cat.jpg" : "assets/cats/light-cat.jpg";
    }

    private String getCatName() {
        return isDark ? "Hacky Grey" : "Sandy Hacky";
    }
}