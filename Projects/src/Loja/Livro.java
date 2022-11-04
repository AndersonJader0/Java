package Loja;

public class Livro extends Produto{
    private String ISBN;

    public Livro(String nome, float valor, String ISBN) {
        super(nome, valor);
        this.ISBN = ISBN;
    }

    public float getValorLiquido(float valor){
        return valor * 0.75f;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
