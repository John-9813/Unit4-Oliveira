package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private HashMap<String, String> contatti; // Nome -> Numero di telefono

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    // 1. Inserimento di una coppia <Nome, telefono>
    public void aggiungiContatto(String nome, String numeroTelefono) {
        contatti.put(nome, numeroTelefono);
        System.out.println("Contatto aggiunto: " + nome + " - " + numeroTelefono);
    }

    // 2. Cancellazione di una coppia <Nome, telefono> a partire dal nome
    public void rimuoviContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("Contatto " + nome + " rimosso.");
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    // 3. Ricerca di una Persona di cui si conosce il numero di telefono
    public String trovaNomePerNumero(String numeroTelefono) {
        for (Map.Entry<String, String> contatto : contatti.entrySet()) {
            if (contatto.getValue().equals(numeroTelefono)) {
                return contatto.getKey();
            }
        }
        return "Nessun contatto trovato per il numero " + numeroTelefono;
    }

    // 4. Ricerca del numero di telefono di una Persona di cui si conosce il Nome
    public String trovaNumeroPerNome(String nome) {
        return contatti.getOrDefault(nome, "Numero non trovato per " + nome);
    }

    // 5. Stampa di tutti i contatti con nome e numero
    public void stampaContatti() {
        if (contatti.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Lista dei contatti:");
            for (Map.Entry<String, String> contatto : contatti.entrySet()) {
                System.out.println("Nome: " + contatto.getKey() + ", Numero: " + contatto.getValue());
            }
        }
    }
}

