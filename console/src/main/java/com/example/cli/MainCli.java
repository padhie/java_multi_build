package com.example.cli;

import com.example.core.Calculator;
import java.util.Scanner;

public class MainCli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Gib zwei Zahlen ein:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Ergebnis: " + calculator.add(a, b));
    }
}
