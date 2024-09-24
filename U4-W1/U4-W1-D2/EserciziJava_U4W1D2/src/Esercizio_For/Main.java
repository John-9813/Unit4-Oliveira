package Esercizio_For;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creo uno scanner per ottenere l'input dall'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedo all'utente di inserire un numero intero
        System.out.println("Inserisci un numero intero per avviare il conto alla rovescia");
        int numero = scanner.nextInt(); // Legge il numero intero inserito dall'utente

        // Eseguiamo il conto alla rovescia usando un ciclo for
        for (int i = numero; i >= 0; i--) {
            System.out.println(i); // Stampo ogni numero
        }
        // Messaggio finale
        System.out.println("Conto alla rovescia terminato!");

        // Chiudo scanner
        scanner.close();
    }
}
