package Esercizi_Switch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creiamo uno scanner per ottenere input dall'utente
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente di inserire un intero
        System.out.println("Inserisci un numero intero (tra 0 e 3): ");
        int numero = scanner.nextInt();  // Legge il numero intero inserito dall'utente

        // Usiamo il costrutto switch per gestire i casi
        switch (numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                // Caso di errore se il numero è fuori dall'intervallo [0, 3]
                System.out.println("Errore: numero fuori dall'intervallo valido (0-3).");
        }

        // Chiudiamo lo scanner
        scanner.close();
    }
}

