package com.vwds.sinfo28.pages.root;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class GetRootHandler1 implements Handler {
    public static final String path = "/";

    @Override
    public void handle(@NotNull Context ctx) {
        // render template with Page data
        ctx.render("index0.jte");



        // ctx.render("index1.jte");
    }
}
