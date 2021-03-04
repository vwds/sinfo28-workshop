package com.vwds.sinfo28;

import com.vwds.sinfo28.pages.root.GetRootHandler;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create(
                config -> config.addStaticFiles("/assets", "src/main/resources", Location.EXTERNAL)
        ).start(7000);

        app.get(GetRootHandler.path, new GetRootHandler());


//        app.get(GetRootHandler1.path, new GetRootHandler1());
//        app.get(GetRootHandler2.path, new GetRootHandler2());
    }
}
