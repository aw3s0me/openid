package de.akorovin.openid

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by aw3s0 on 11/5/2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}