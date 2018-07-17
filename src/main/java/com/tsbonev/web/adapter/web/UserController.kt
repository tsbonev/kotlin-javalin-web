package com.tsbonev.web.adapter.web

import com.tsbonev.web.core.User
import io.javalin.Handler
import java.time.LocalDate

class UserController{

    companion object {
        val viewUser: Handler = Handler { ctx -> ctx.result(User(1,
                "John",
                LocalDate.now().dayOfYear).toString()) }
    }
}