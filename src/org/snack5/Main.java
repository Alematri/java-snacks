package org.snack5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input dall'utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una testo: ");
        String input = scanner.nextLine();
        scanner.close();

        // Inizializzo i contatori
        int caratteriAlfabetici = 0;
        int numeri = 0;
        int simboliNonAlfanumerici = 0;

        // Ciclo ogni carattere del testo
        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);
            if (Character.isLetter(carattere)) {
                caratteriAlfabetici++;
            } else if (Character.isDigit(carattere)) {
                numeri++;
            } else {
                simboliNonAlfanumerici++;
            }
        }

        // Stampo
        System.out.println("Caratteri alfabetici: " + caratteriAlfabetici);
        System.out.println("Numeri: " + numeri);
        System.out.println("Simboli non alfanumerici: " + simboliNonAlfanumerici);
    }
}