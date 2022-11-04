package Armas;

public abstract class Arma implements Disparavel {

    protected double destruicao;

    public Arma(double destruicao){
        this.destruicao = destruicao;
    }

    public double getDestruicao() {
        return destruicao;
    }

    public void setDestruicao(double destruicao) {
        this.destruicao = destruicao;
    }
}
