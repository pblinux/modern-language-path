package com.example

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json()
    }
    registerSampleRoutes()
}

fun Application.registerSampleRoutes() {
    routing {
        sampleRoute()
    }
}

fun Route.sampleRoute() {
    route("/") {
        get { call.respondText { "Hello from backend" } }
    }

    route("/test") {
        get { call.respond(mapOf("status" to "ok")) }
    }
}
