package com.example.m5springbootheroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello () {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Awesome app</title>
                </head>
                <body>
                <h1>Hello World Page</h1>
                </body>
                </html>
                """;
    }

    @GetMapping("/home")
    public String home () {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Awesome app</title>
                </head>
                <body>
                <h1>Home page</h1>
                </body>
                </html>
                """;
    }


}
