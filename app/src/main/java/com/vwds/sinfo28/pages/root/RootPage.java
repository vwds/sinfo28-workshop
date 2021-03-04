package com.vwds.sinfo28.pages.root;

import org.jetbrains.annotations.NotNull;

public class RootPage {
    public final String catImgPath;
    public final String catName;
    public final boolean isDark;

    public RootPage(@NotNull String variation) {
        this.isDark = variation.equalsIgnoreCase("dark");
        this.catName = this.getCatName();
        this.catImgPath = this.getImgPath();
    }

    private String getImgPath() {
        return isDark ? "assets/grey-hacky.jpg" : "assets/sandy-hacky.jpg";
    }

    private String getCatName() {
        return isDark ? "Grey Hacky" : "Sandy Hacky";
    }
}