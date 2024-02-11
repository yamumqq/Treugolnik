package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа a, b и c:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            if ((a == b) && (b == c)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника.");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника.");
            } else if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника.");
            } else {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника.");
            }
        } else {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника.");
        }
    }
}