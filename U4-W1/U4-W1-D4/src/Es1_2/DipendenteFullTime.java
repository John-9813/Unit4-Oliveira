package Es1_2;

public class DipendenteFullTime extends Dipendente {
    private final double stipendioMensile;

    public DipendenteFullTime(String matricola, String dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}
