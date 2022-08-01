package org.example;

import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcom to token generator.");
        System.out.println("How long token you'd like to generate? " + "Choose 5, 10 or 15.");
        int length = scanner.nextInt();

        if (length == 5) {
            System.out.print("This is your token: ");
            int i = 0;
            while (i < 5) {
                Random random = new Random();
                int liczba = random.nextInt(33, 125);
                i++;
                char a = (char) liczba;
                String znak = ("" + a);
                System.out.print(znak);
            }
        } else if (length == 10) {
            System.out.print("This is your token: ");
            int i = 0;
            while (i < 10) {
                Random random = new Random();
                int liczba = random.nextInt(33, 125);
                i++;
                char a = (char) liczba;
                String znak = ("" + a);
                System.out.print(znak);
            }
        } else if (length == 15) {
            System.out.print("This is your token: ");
            int i = 0;
            while (i < 15) {
                Random random = new Random();
                int liczba = random.nextInt(33, 125);
                i++;
                char a = (char) liczba;
                String znak = ("" + a);
                System.out.print(znak);
            }
        } else System.out.println("Incorrect length. Try again.");
    }
}
