package Loja;

public class DVD extends Produto{
    private String SN;

    public DVD(String nome, float valor, String SN) {
        super(nome, valor);
        this.SN = SN;
    }

    public float getValorLiquido(float valor){
        return valor * 0.9f;
    }

    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }
}
