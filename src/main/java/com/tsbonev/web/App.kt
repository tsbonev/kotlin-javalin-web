import com.tsbonev.web.adapter.web.HomeController
import com.tsbonev.web.adapter.web.UserController
import io.javalin.ApiBuilder.*
import io.javalin.Javalin

fun main(args: Array<String>) {

    val port = 8080

    val app = Javalin.create().apply {
        enableStandardRequestLogging()
        enableDynamicGzip()
        port(port)
    }.start()

    app.routes {

        path("/") {
            get(HomeController.viewHome)
        }

        path("users") {
            get(UserController.viewUser)
        }
    }
}