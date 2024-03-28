package org.snack1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Inserisci un numero pari compreso tra 10 e 20: ");
            number = scanner.nextInt();

            if (number >= 10 && number <= 20 && number % 2 == 0) {
                System.out.println("Numero valido!");
                break;
            } else {
                System.out.println("Numero non valido! Riprova.");
            }
        }

        scanner.close();
    }
}