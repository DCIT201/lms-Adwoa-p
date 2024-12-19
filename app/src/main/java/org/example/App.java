/*
 * This should be your main class where all your objects will be created
 */
package org.example;
import java.util.List;
import java.util.ArrayList;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
