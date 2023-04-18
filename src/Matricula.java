public class Matricula {
    double patrimonio;
    int estrato;
    double matricula;
    double payment = 50000;
    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }
    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    public double getMatricula() {
        if ((patrimonio > 2000000) && (estrato > 3)) {
            matricula = payment + 0.03 * patrimonio;
        }
        else {
            matricula = payment;
        }
        return matricula;
    }
}
