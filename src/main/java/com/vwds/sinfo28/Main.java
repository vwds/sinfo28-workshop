package com.vwds.sinfo28;

import com.vwds.sinfo28.pages.root.GetRootHandler;
import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);

        app.get(GetRootHandler.path, new GetRootHandler());
    }
}
