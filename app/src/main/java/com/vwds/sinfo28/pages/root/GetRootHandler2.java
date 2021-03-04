package com.vwds.sinfo28.pages.root;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class GetRootHandler2 implements Handler {
    public static final String path = "/";

    @Override
    public void handle(@NotNull Context ctx) {
        // create new Page with parsed query parameters
        RootPage rootPage = new RootPage(
            GetRootHandler2.parseCatVariation(ctx)
        );

        // render template with Page data
        //ctx.render("index.jte", Collections.singletonMap("page", rootPage));


        ctx.render("index2.jte", Collections.singletonMap("page", rootPage));
    }

    private static String parseCatVariation(@NotNull Context ctx) {
        return ctx.queryParam("cat-variation", "light");
    }
}
