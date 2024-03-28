package org.snack4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input della stringa dall'utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una testo: ");
        String input = scanner.nextLine();
        scanner.close();

        // Trimmo, tolgo punteggiatura e trasformo in minuscolo
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Verifico se la stringa è palindroma
        boolean isPalindroma = isPalindroma(cleanedInput);

        // Stampo il risultato
        if (isPalindroma) {
            System.out.println(input + " è un testo palindromo.");
        } else {
            System.out.println(input + " non è un testo palindromo.");
        }
    }

    // Metodo isPalindroma
    public static boolean isPalindroma(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Controllo che i caratteri all'estremità sinistra e destra sono uguali
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // non è palindroma
            }
            start++;
            end--;
        }
        return true; // altrimenti è palindroma
    }
}