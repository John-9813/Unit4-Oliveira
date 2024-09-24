package Esercizio_While;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creiamo uno scanner per ottenere input dall'utente
        Scanner scanner = new Scanner(System.in);
        String input;

        // Ciclo while che continua fino a quando l'utente non inserisce ":q"
        System.out.println("Inserisci una stringa (inserisci ':q' per uscire): ");
        input = scanner.nextLine();  // Legge la stringa dall'utente

        while (!input.equals(":q")) {  // Finché l'utente non inserisce ":q"
            // Iniziamo con la suddivisione dei caratteri
            int i = 0;
            while (i < input.length()) {
                // Stampa il carattere corrente
                System.out.print(input.charAt(i));

                // Aggiunge una virgola dopo ogni carattere tranne l'ultimo
                if (i < input.length() - 1) {
                    System.out.print(", ");
                }
                i++;  // Passiamo al prossimo carattere
            }

            System.out.println();  // Nuova riga dopo aver stampato la stringa suddivisa

            // Chiediamo di nuovo all'utente di inserire una stringa
            System.out.println("Inserisci una stringa (inserisci ':q' per uscire): ");
            input = scanner.nextLine();  // Legge la nuova stringa
        }

        System.out.println("Programma terminato.");

        // Chiudiamo lo scanner
        scanner.close();
    }
}

