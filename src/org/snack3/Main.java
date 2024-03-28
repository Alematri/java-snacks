package org.snack3;

public class Main {
    public static void main(String[] args) {
        int[] number = {191, 1, 333, 2, 455, 4, 898, 5, 339, 6};

        // Inizializzo la variabile che mi darà la somma
        int sommaDispari = 0;

        // Sommo gli elementi in posizione dispari
        for (int i = 1; // La inizializzo da 1 anzichè 0 perchè 0 è pari
             i < number.length; // così durante il ciclo non supero la lunghezza dell'array
             i += 2) { // dopo ogni iterazione incremento il contatore di 2 invece che di 1 per passare al prossimo dispari

            sommaDispari += number[i]; // aggiungo alla variabile il numero che ho ottenuto dalle iterazioni
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + sommaDispari);
    }
}