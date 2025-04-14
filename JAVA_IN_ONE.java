
import java.util.Scanner;

public class Through {

    public static void main(String[] args) {
        // JAVA SYNTAX
        System.out.println("Hello, Java!");
        // JAVA OUTPUT
        System.out.print("No new line ");
        System.out.println("With new line");
        // Java Comments
        // write something here 
        /* this 
           is 
           commentary */

        // JAVA VARIABLES
        int age = 20;
        System.out.println(age);

        // Java Data Types
        int x = 10;
        double y = 5.5;
        char letter = 'A';
        boolean isTrue = true;
        System.out.println(x + ", " + y 
        + ", " + letter + ", " + isTrue);
        //  Java Operators
        int a = 5 + 3 * 2;
        System.out.println(a);
        // Java Strings
        String name = "Java";
        System.out.println("Hello, " + name);

        // java booleans
        boolean isAdult = true;
        System.out.println(isAdult);
        // Java If/else
        age = 18;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Java Switch
        int day = 3;
        switch (day) {
            case 1 ->
                System.out.println("Monday");
            case 2 ->
                System.out.println("Tuesday");
            default ->
                System.out.println("Other day");
        }

        // Java While Loop
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }

        // Java For Loop
        for (int j = 0; i < 3; j++) {
            System.out.println("Step " + j);
        }
        // Java Break/Continue
        for (int t = 1; t <= 5; i++) {
            if (t == 3) {
                continue;
            }
            System.out.println(t);
        }
        // java arrays
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[1]);

        // CALLING METHODS
        greet();
        greet1("Nurim");

        System.out.println(sum(2, 3));
        System.out.println(sum(2.5, 3.5));

        System.out.println(factorial(5));

        Car myCar = new Car();
        System.out.println(myCar.model);

    }

    // java methods
    static void greet() {
        System.out.println("Hello from method!");
    }

    // Java Method Parameters
    static void greet1(String name) {
        System.out.println("Hello, " + name);
    }

    // Java Method Overloading
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    // Java Scope
    int x = 5;
    {
        int y = 10;
        System.out.println(x + y);
    }
    // Java Recursion
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Java OOP
    class Animal {
        void sound() {
            System.out.println("Some sound");
        }
    }
    
    // Java Classes/Objects
    class Car {
        String model = "Toyota";
    }
    
    // Java Class Attributes
    class Person {
        int age = 30;
    }
    
    // Java Class Methods
    class Greeting {
        void sayHello() {
            System.out.println("Hello!");
        }
    }
    
    // Java Constructors
    class Student {
        String name;
        Student(String n) {
            name = n;
        }
    }
    
    // Java Modifiers
    public class Main {
        public int number = 5;
    }
    // Java Encapsulation
    class BankAccount {
        private int balance = 100;
        public int getBalance() {
            return balance;
        }
    }
    // Java Inheritance
    class Dog extends Animal {
        void bark() {
            System.out.println("Woof");
        }
    }
    
    // Java Polymorphism
    class Animal2 {
        void sound() {
            System.out.println("Animal sound"); }}

    class Cat extends Animal2 {
        void sound() {
            System.out.println("Meow"); } }

    // Java Inner Classes
    class Outer {
        class Inner {
            void display() {
                System.out.println("Inner Class");
            }}}

    // Java Abstraction
    abstract class Shape {
        abstract void draw();
    }
    class Circle extends Shape {
        void draw() {
            System.out.println("Drawing Circle");
        }}
    // Java Interface
    interface Drawable {
        void draw(); }
        
    class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }
    
    // Java Enums
    enum Level {
        LOW, MEDIUM, HIGH
    }
}
