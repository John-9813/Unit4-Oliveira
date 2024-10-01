package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);
        boolean esci = false;

        while (!esci) {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Trova nome per numero di telefono");
            System.out.println("4. Trova numero per nome");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("0. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Pulizia del buffer

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il numero di telefono:");
                    String numeroTelefono = scanner.nextLine();
                    rubrica.aggiungiContatto(nome, numeroTelefono);
                    break;
                case 2:
                    System.out.println("Inserisci il nome del contatto da rimuovere:");
                    String nomeDaRimuovere = scanner.nextLine();
                    rubrica.rimuoviContatto(nomeDaRimuovere);
                    break;
                case 3:
                    System.out.println("Inserisci il numero di telefono:");
                    String numeroDaCercare = scanner.nextLine();
                    System.out.println(rubrica.trovaNomePerNumero(numeroDaCercare));
                    break;
                case 4:
                    System.out.println("Inserisci il nome:");
                    String nomeDaCercare = scanner.nextLine();
                    System.out.println(rubrica.trovaNumeroPerNome(nomeDaCercare));
                    break;
                case 5:
                    rubrica.stampaContatti();
                    break;
                case 0:
                    esci = true;
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }

        scanner.close();
    }
}

