package com.tsbonev.web.adapter.web

import io.javalin.Handler

class HomeController{

    companion object {
        val viewHome: Handler = Handler { ctx -> ctx.html(PageReader.readPage("/index")) }
    }
}