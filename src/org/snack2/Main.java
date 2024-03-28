package org.snack2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Stefan", "Alessandro", "Hakan", "Nicolo", "Matteo", "Federico", "Lautaro", "Alexis", "Benjamin", "Markus", "Denzel", "Francesco", "Yann", "Carlos", "Henrikh"};
        String[] surnames = {"De Vrij", "Bastoni", "Calhanoglu", "Barella", "Darmian", "Dimarco", "Martinez", "Sanchez", "Pavard", "Thuram", "Dumfries", "Acerbi", "Sommer", "Augusto", "Mkhitaryan"};

        Random random = new Random();

        for (int i = 0; i < 11; i++) {
            String randomName = names[random.nextInt(names.length)];
            String randomSurname = surnames[random.nextInt(surnames.length)];
            System.out.println(randomName + " " + randomSurname);
        }
    }
}