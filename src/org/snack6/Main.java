package org.snack6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di secondi: ");
        int secondi = scanner.nextInt();
        scanner.close();

        int ore = secondi / 3600;
        int minuti = (secondi % 3600) / 60;
        int restantiSecondi = secondi % 60;

        String tempo = String.format("%02d:%02d:%02d", ore, minuti, restantiSecondi);

        System.out.println("Tempo convertito: " + tempo);
    }
}