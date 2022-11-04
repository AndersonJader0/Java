package Loja;

public abstract class Produto implements Autenticavel {
    private String nome;
    private float valor;
    public Produto(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public float getValorLiquido(float valor){
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
