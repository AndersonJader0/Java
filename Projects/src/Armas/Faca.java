package Armas;

public class Faca extends Arma{
    private int lamina;

    public Faca(double destruicao, int lamina){
        super(destruicao);
        this.lamina = lamina;
    }

    public int getLamina() {
        return lamina;
    }

    public void setLamina(int lamina) {
        this.lamina = lamina;
    }
}