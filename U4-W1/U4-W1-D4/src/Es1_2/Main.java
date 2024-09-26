package Es1_2;

public class Main {

    public static void main(String[] args) {
        // Creiamo alcune istanze di dipendenti
        Dipendente dip1 = new DipendenteFullTime("FT001", "PRODUZIONE", 2500.0);
        Dipendente dip2 = new DipendentePartTime("PT001", "VENDITE", 20.0, 120);
        Dipendente dip3 = new Dirigente("DIR001", "AMMINISTRAZIONE", 5000.0, 1500.0);

        // Creiamo un array di dipendenti
        Dipendente[] dipendenti = {dip1, dip2, dip3};

        // Calcoliamo e stampiamo gli stipendi
        for (Dipendente dip : dipendenti) {
            System.out.println("Matricola: " + dip.getMatricola() + " | Stipendio: " + dip.calculateSalary());
        }

        // Calcolare lo stipendio totale
        double stipendioTotale = 0;
        for (Dipendente dip : dipendenti) {
            stipendioTotale += dip.calculateSalary();
        }
        System.out.println("Stipendio totale: " + stipendioTotale);
    }
}
