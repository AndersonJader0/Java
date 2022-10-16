package AgenciaBancaria;

public class Conta {

    private static int contadorContas = 1;
    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.numeroConta = contadorContas;
        this.pessoa = pessoa;
        contadorContas += 1;
    }

    public static int getContadorContas() {
        return contadorContas;
    }

    public static void setContadorContas(int contadorContas) {
        Conta.contadorContas = contadorContas;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "\nNumero da conta: " + getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCpf: " + this.pessoa.getCpf() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nsaldo: " + Utilitarios.doubleToString(this.getSaldo());
    }

    public void depositar(Double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("seu depósito foi realizado com sucesso!");
        }else{
            System.out.println("não foi possível realizar o depósito!");
        }
    }
    public void sacar(Double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("seu saque foi realizado com sucesso!");
        }else{
            System.out.println("não foi possível realizar o saque!");
        }
    }
    public void transferir(Conta contaDeposito, double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            contaDeposito.saldo = contaDeposito.getSaldo() + valor;
            System.out.println("transferência realizada com sucesso!");
        } else{
            System.out.println("não foi possível realizar a transferência!");
        }
    }

}