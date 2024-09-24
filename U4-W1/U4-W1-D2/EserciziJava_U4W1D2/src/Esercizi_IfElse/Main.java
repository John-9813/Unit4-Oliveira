package Esercizi_IfElse;

import java.util.Scanner;

public class Main {

    // Metodo che determina se una stringa ha un numero di caratteri pari o dispari
    public static boolean stringaPariDispari(String str) {
        // Restituisce true se il numero di caratteri è pari, altrimenti false
        return str.length() % 2 == 0;
    }

    // Metodo che determina se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        // Un anno è bisestile se è divisibile per 4, ma non per 100, a meno che non sia divisibile per 400
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                // Se è divisibile per 100, deve essere divisibile anche per 400
                return anno % 400 == 0;
            } else {
                // Se è divisibile per 4 ma non per 100, è bisestile
                return true;
            }
        }
        // Se non è divisibile per 4, non è bisestile
        return false;
    }

    public static void main(String[] args) {
        // Creiamo uno scanner per l'input da tastiera
        Scanner scanner = new Scanner(System.in);

        // Utilizzo del metodo stringaPariDispari
        System.out.println("Inserisci una stringa: ");
        String inputStringa = scanner.nextLine();  // Legge la stringa inserita dall'utente
        boolean pariDispari = stringaPariDispari(inputStringa);
        if (pariDispari) {
            System.out.println("La stringa ha un numero pari di caratteri.");
        } else {
            System.out.println("La stringa ha un numero dispari di caratteri.");
        }

        // Utilizzo del metodo annoBisestile
        System.out.println("Inserisci un anno: ");
        int anno = scanner.nextInt();  // Legge l'anno inserito dall'utente
        boolean bisestile = annoBisestile(anno);
        if (bisestile) {
            System.out.println(anno + " è un anno bisestile.");
        } else {
            System.out.println(anno + " non è un anno bisestile.");
        }

        // Chiudiamo lo scanner
        scanner.close();

}
}