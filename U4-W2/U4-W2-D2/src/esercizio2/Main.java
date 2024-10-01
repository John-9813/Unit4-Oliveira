package esercizio2;

import java.util.*;

public class Main {

    // Funzione per generare N numeri casuali da 0 a 100
    public static List<Integer> generaNumeriCasuali(int N) {
        List<Integer> numeri = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            numeri.add(rand.nextInt(101));
        }

        Collections.sort(numeri);  // Ordina la lista
        return numeri;
    }

    // Funzione per ottenere una lista seguita dal suo inverso
    public static List<Integer> creaListaConInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        List<Integer> inverso = new ArrayList<>(lista);
        Collections.reverse(inverso);
        nuovaLista.addAll(inverso);
        return nuovaLista;
    }

    // Funzione per stampare numeri in posizioni pari o dispari
    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiede il numero di elementi
        System.out.println("Inserisci un numero intero N: ");
        int N = scanner.nextInt();

        // Generazione della lista ordinata di numeri casuali
        List<Integer> numeriCasuali = generaNumeriCasuali(N);
        System.out.println("Numeri casuali ordinati: " + numeriCasuali);

        // Creazione della lista con il suo inverso
        List<Integer> listaConInverso = creaListaConInverso(numeriCasuali);
        System.out.println("Lista con inverso: " + listaConInverso);

        // Scelta per stampare posizioni pari o dispari
        System.out.println("Vuoi stampare i valori in posizioni pari? (true/false): ");
        boolean pari = scanner.nextBoolean();
        stampaPosizioni(listaConInverso, pari);

        scanner.close();
    }
}

