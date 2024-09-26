package Es1_2;

public abstract class Dipendente {
    private final String matricola;
    private final String dipartimento;

    // Costruttore
    public Dipendente(String matricola, String dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    // Getter per matricola e dipartimento
    public String getMatricola() {
        return matricola;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    // Metodo astratto per calcolare lo stipendio, che sarà implementato dalle sottoclassi
    public abstract double calculateSalary();
}
