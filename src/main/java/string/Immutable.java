package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Immutable {
    public static void main(String[] args) {
        String customerName = "alice";
        printGreeting(customerName);

        System.out.println("Still on file: " + customerName);
    }

    static void printGreeting(String name) {
        name = "nghia";
        String greeting = "Hello, " + name.toUpperCase() + "!";
        System.out.println(greeting);
    }
}

