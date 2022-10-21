package Login;

import java.util.Objects;

import static AgenciaBancaria.AgenciaBancaria.operacoes;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private int senhaAdm = 124912;

    public Funcionario(String nome, String cpf, double salario, int senhaAdm){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senhaAdm = senhaAdm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void login(int senha, int senhaCadastro){
        if(Objects.equals(senhaCadastro, senha)){
            operacoes();
        }else if(Objects.equals(senhaAdm, senha)){
            operacoes();
        }else{
            System.out.println("Login inválido!");
        }
    }
    public void loginAdm(int senha){
        if(Objects.equals(this.senhaAdm, senha)){
            operacoes();
        }else{
            System.out.println("Senha inválida!");
        }
    }
}
