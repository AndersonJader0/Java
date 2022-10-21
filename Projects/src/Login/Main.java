package Login;
import AgenciaBancaria.Pessoa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("*******  Selecione o login que deseja efetuar  *******");
        System.out.println("------------------------------------------------------");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        int option = teclado.nextInt();

        if (option == 2) ;
        System.out.println("Digite a senha de cadastro: ");
        int senhaCadastro = teclado.nextInt();
        System.out.println("Digite a senha: ");
        int senha = teclado.nextInt();
        //Pessoa.login(senhaCadastro);

        if (option == 1) {

            System.out.println("Digite a senha: ");
            int senha2 = teclado.nextInt();
            //Pessoa.login(senha2);
        }

        //public static void teste() {
            System.out.println("---------------------------------------------------------");
            System.out.println("-------------Bem vindos a Agência Bancária---------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("*******  Selecione a operação que deseja efetuar  *******");
            System.out.println("---------------------------------------------------------");
        }
    }


