package Library.Herança.Banco;

public class ContaCorrente extends Conta {
    private String tipo;

    private double chequeEspecial;


    public ContaCorrente(String tipo) {
        super(); // É redundante. porem se for feita será sempre na 1 linha do construtor.
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + this.chequeEspecial;
    }
                                                           /*
                                                             Conta conta = new Conta()
                                                             Conta cc = new ContaCorrente();
                                                           */ //Pode utilizar um objeto da subclasse sempre que o programa esperar por um objeto da superclasse.
    // Assim é possível atribuir um objeto do tipo conta corrente em uma variavel do tipo conta.

                                                           /*Pode ainda atribuir a um objeto referenciado na variável cc a uma variavel do tipo ContaCorrente com o uso de cast.
                                                              ContaCorrente c1 = (ContaCorrente) cc;
                                                                */

    @Override                                              /*Sobrescrita de métodos*/
    //Ou seja redefinir na subclasse um método existente na superclasse.
    public void retirar(double valor) {
        valor = valor + 10;
        super.retirar(valor);
    }


}