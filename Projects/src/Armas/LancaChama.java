package Armas;

public class LancaChama extends Arma{
    private double gas;

    public LancaChama(double destruicao, double gas){
            super(destruicao);
            this.gas = gas;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }
    public void disparar(){
        if(gas > 10){
            this.setGas(getGas()-10);
        }
    }

    @Override
    public void recarregar() {
        if(gas < 10){
            this.setGas(getGas()+100);
        }
    }
}
