/*
    Assignment 5: Abstract classes
    PAWAN KOSHTI
    125B1F079
    A2
*/

/*
5) Implement a program using an abstract class named Shape to calculate the area
and perimeter of different geometric shapes. Derive the classes Circle, Square,
Rectangle, and Triangle from the Shape class. Each derived class should override
the abstract methods to calculate the area and perimeter according to the
respective shape's formula.
*/

import java.util.*;

// Abstract Class - a class which has at least one method without body
// Abstract class needs to be inherited and objects of such classes cannot be created
abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    // Method to calculate Area of Circle
    void area() {
        double a = 3.14 * r * r;
        System.out.println("Area Of Circle is " + a);
    }

    // Method to calculate Circumference of Circle
    void perimeter() {
        double per = 2 * 3.14 * r;
        System.out.println("Circumference of Circle is " + per);
    }
}

class Square extends Shape {
    double s;

    Square(double s) {
        this.s = s;
    }

    // Method to calculate Area of Square
    void area() {
        double a = s * s;
        System.out.println("Area Of Square is " + a);
    }

    // Method to calculate Perimeter of Square
    void perimeter() {
        double per = 4 * s;
        System.out.println("Perimeter of Square is " + per);
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    // Method to calculate Area of Rectangle
    void area() {
        double a = l * b;
        System.out.println("Area Of Rectangle is " + a);
    }

    // Method to calculate Perimeter of Rectangle
    void perimeter() {
        double per = 2 * (l + b);
        System.out.println("Perimeter of Rectangle is " + per);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to calculate Area of Triangle
    void area() {
        double s = (a + b + c) / 2;
        double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area Of Triangle is " + ar);
    }

    // Method to calculate Perimeter of Triangle
    void perimeter() {
        double per = a + b + c;
        System.out.println("Perimeter of Triangle is " + per);
    }
}

public class assignment5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n**** MENU ****");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter the radius of circle: ");
                    double r = sc.nextDouble();

                    Circle cir = new Circle(r);
                    cir.area();
                    cir.perimeter();
                    break;

                case 2:
                    System.out.print("Enter the side of square: ");
                    double s = sc.nextDouble();

                    Square sq = new Square(s);
                    sq.area();
                    sq.perimeter();
                    break;

                case 3:
                    System.out.print("Enter the length and breadth of rectangle: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();

                    Rectangle rect = new Rectangle(l, b);
                    rect.area();
                    rect.perimeter();
                    break;

                case 4:
                    System.out.print("Enter the three sides of triangle: ");
                    double a = sc.nextDouble();
                    double b1 = sc.nextDouble();
                    double c = sc.nextDouble();

                    Triangle tri = new Triangle(a, b1, c);
                    tri.area();
                    tri.perimeter();
                    break;

                case 5:
                    System.out.println("Successfully Exited");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 5);
    }
}