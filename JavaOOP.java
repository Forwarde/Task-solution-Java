package javaoop;
import java.util.Scanner;

// Java OOP Java Classes and Objects
class Laptop {
    int num_laptop = 5;

    void phones() {
        System.out.println("My Laptop is:  " + num_laptop + " поколение");
    }
}

class Phone {
    int IMEI = 646372434;

    void phones() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи модель телефона: ");
        String myPhone = input.nextLine();


        System.out.println("Мой телефон называется: " + myPhone + IMEI);
    }
}

class Book {
    String title = "Гарри Поттер";

    void display() {
        System.out.println("Книга: " + title);
    }
}

// Java Class Attributes

class PC {
    String pcName = "Acer";
    int defaultRam = 8;

    void showPC() {
        System.out.println("Your PC is " + pcName + "it has" + defaultRam);
    }
}

class Bike {
    String bikeName = "Yamaha";
    int cilinder = 5;

    void bikeName() {
        System.out.println("Bike is: " + bikeName +
                "Cilinder amount is: " + cilinder);
    }
}

class carType {
    String carName = "Toyota";
    int cilinders = 5;

    void runCar() {
        System.out.println(
        carName + "speep up to " +
        "200km/hour with " + cilinders);
    }
}

class Bird {
    void fly() {
        System.out.println(
        "Птица летит!");
    }
}

class Person {
    String jump = "Прыгнул";
    void action() {
        System.out.println(
                "Человек " + jump);
    }
}

// Java Constructors

class Flower {
    String type;

    Flower() { // Конструктор
        type = "Роза";
    }

    void showType() {
        System.out.println(
        "Цветок: " + type);
    }
}

class Game {
    String name;

    Game(String gameName) { // с параметром
        name = gameName;
    }

    void gameName() {
        System.out.println("Игра называется: " + name);
    }
}

class windowSize {
    int width;
    int height;

    windowSize(int w, int h) { // с параметрами
        width = w;
        height = h;
    }

    void showSize() {
        System.out.println(
        "Разрешение экрана: " + width + "x" + height);
    }
}

// Java Modifiers
class Bikes {
    public String name =
    "Yamaha YZF-R6";

    public void sound() {
        System.out.println(
        name + " рычит!");
    }
}

class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}

class BankAccount {
    private double balance = 1000.0; 

    public double getBalance() {
        return balance;
    }
}

public class JavaOOP {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println(
                "Your Balance is: " +
                acc.getBalance()
        );
    }
}
