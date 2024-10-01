package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiede il numero di parole da inserire
        System.out.println("Inserisci il numero di parole da inserire: ");
        int N = scanner.nextInt();
        scanner.nextLine();  // Pulizia del buffer

        Set<String> parole = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        // Inserimento delle parole
        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci una parola: ");
            String parola = scanner.nextLine();

            if (!parole.add(parola)) {
                duplicati.add(parola);
            }
        }

        // Stampa parole duplicate
        if (duplicati.isEmpty()) {
            System.out.println("Non ci sono parole duplicate.");
        } else {
            System.out.println("Parole duplicate: " + duplicati);
        }

        // Stampa numero di parole distinte
        System.out.println("Numero di parole distinte: " + parole.size());

        // Stampa elenco di parole distinte
        System.out.println("Parole distinte: " + parole);

        scanner.close();
    }
}