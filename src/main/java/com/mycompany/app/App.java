package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World from Jenkins World Nice 2018! Is everyone having a great time";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
