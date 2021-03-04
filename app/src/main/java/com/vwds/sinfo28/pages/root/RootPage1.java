package com.vwds.sinfo28.pages.root;

import org.jetbrains.annotations.NotNull;

public class RootPage1 {
    public final String catImgPath;
    public final String catName;
    public final boolean isDark;

    public RootPage1(@NotNull String variation) {
        this.isDark = variation.equalsIgnoreCase("dark");
        if(this.isDark) {
            this.catImgPath = "assets/grey-hacky.jpg";
            this.catName = "Grey Hacky";
        } else {
            this.catImgPath = "assets/sandy-hacky.jpg";
            this.catName = "Sandy Hacky";
        }
    }
}