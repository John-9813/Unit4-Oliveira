//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    // Metodo che moltiplica due numeri interi
    public static int moltiplica(int a, int b) {
        // Moltiplica i due interi e restituisce il risultato
        return a * b;
    }

    // Metodo che concatena una stringa e un intero
    public static String concatena(String str, int num) {
        // Converte l'intero in stringa e lo concatena alla stringa passata
        return str + num;
    }

    // Metodo che inserisce una stringa in un array di 5 elementi, restituendo un array di 6 elementi
    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        // Controlliamo che l'array abbia 5 elementi
        if (array.length != 5) {
            throw new IllegalArgumentException("L'array deve avere esattamente 5 elementi");
        }

        // Creiamo un nuovo array di 6 elementi
        String[] nuovoArray = new String[6];

        // Copiamo i primi due elementi dal vecchio array al nuovo
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];

        // Inseriamo la nuova stringa alla terza posizione (indice 2)
        nuovoArray[2] = nuovaStringa;

        // Copiamo gli elementi dal vecchio array, spostando quelli successivi alla nuova stringa
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        // Restituiamo il nuovo array
        return nuovoArray;
    }

    public static void main(String[] args) {
        // Eseguiamo il metodo moltiplica
        int prodotto = moltiplica(4, 5);
        System.out.println("Prodotto: " + prodotto);  // Stampa: Prodotto: 20

        // Eseguiamo il metodo concatena
        String concatenazione = concatena("Numero: ", 10);
        System.out.println("Concatenazione: " + concatenazione);  // Stampa: Concatenazione: Numero: 10

        // Eseguiamo il metodo inserisciInArray
        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        String[] nuovoArray = inserisciInArray(array, "nuovo");

        // Stampiamo il nuovo array
        System.out.println("Nuovo array:");
        for (String s : nuovoArray) {
            System.out.println(s);
        }
        // Output:
        // Nuovo array:
        // uno
        // due
        // nuovo
        // tre
        // quattro
        // cinque

        // Creiamo uno scanner per leggere l'input dell'utente da tastiera
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente di inserire tre stringhe
        System.out.println("Inserisci la prima stringa: ");
        String primaStringa = scanner.nextLine();  // Legge la prima stringa

        System.out.println("Inserisci la seconda stringa: ");
        String secondaStringa = scanner.nextLine();  // Legge la seconda stringa

        System.out.println("Inserisci la terza stringa: ");
        String terzaStringa = scanner.nextLine();  // Legge la terza stringa

        // Concatenazione delle stringhe in ordine di inserimento
        String concatenazioneNormale = primaStringa + " " + secondaStringa + " " + terzaStringa;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneNormale);

        // Concatenazione delle stringhe in ordine inverso
        String concatenazioneInversa = terzaStringa + " " + secondaStringa + " " + primaStringa;
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);

        // Chiudiamo lo scanner per evitare problemi di risorse
        scanner.close();
    }
}
