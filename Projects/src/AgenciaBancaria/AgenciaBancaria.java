package AgenciaBancaria;
import java.util.*;

public class AgenciaBancaria {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();

        System.out.println("---------------------------------------------------------");
        System.out.println("*******  Selecione o login que deseja efetuar  *******");
        System.out.println("------------------------------------------------------");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        int option = teclado.nextInt();

        if (option == 1) {
            System.out.println("Digite a senha: ");
            int senha = teclado.nextInt();
            Pessoa.login(senha);
        }

        if (option == 2) {
            System.out.println("Digite a senha de cadastro: ");
            int senhaCadastro = teclado.nextInt();
            System.out.println("Cadastro feito com sucesso!");
            operacoes();
        }
    }
    public static void operacoes() {
        System.out.println("---------------------------------------------------------");
        System.out.println("-------------Bem vindos a Agência Bancária---------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("*******  Selecione a operação que deseja efetuar  *******");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Cadastrar conta   |");
        System.out.println("|   Opção 2 - Deposito          |");
        System.out.println("|   Opção 3 - Saque             |");
        System.out.println("|   Opção 4 - Transferência     |");
        System.out.println("|   Opção 5 - Listar contas     |");
        System.out.println("|   Opção 6 - Sair              |");

        int operacao = teclado.nextInt();
        ;

        switch (operacao) {
            case 1:
                registrarConta();
                break;

            case 2:
                depositar();
                break;

            case 3:
                sacar();
                break;

            case 4:
                transferir();
                break;

            case 5:
                listarContas();
                break;

            case 6:
                System.out.println("Encerrando sistema!");
                System.exit(2);

            default:
                System.out.println("Opção inválida!");
                operacoes();
                break;
        }
    }

    private static void listarContas() {
        if (contasBancarias.size() > 0) {
            for (Conta conta : contasBancarias) {
                System.out.println(conta);
            }
        } else {
            System.out.println("Não há contas cadastradas");
        }
        operacoes();
    }

    private static void transferir() {
        System.out.println("Digite o número da conta do remetente: ");
        int numeroContaRemetente = teclado.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if (contaRemetente != null) {
            System.out.println("Digite o número da conta do destinatário: ");
            int numeroContaDestinatario = teclado.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if (contaDestinatario != null) {
                System.out.println("Valor da transferência: ");
                Double valor = teclado.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);

            } else {
                System.out.println("A conta destinário não foi encontrada");
            }
        } else {
            System.out.println("Conta para transferência não encontrada");
        }
        operacoes();
    }

    public static void registrarConta() {
        System.out.println("\nNome: ");
        String nome = teclado.next();

        System.out.println("\nCpf: ");
        String cpf = teclado.next();

        System.out.println("\nEmail: ");
        String email = teclado.next();

        Pessoa pessoa = new Pessoa(nome, cpf, email);
        Conta conta = new Conta(pessoa);

        contasBancarias.add(conta);
        System.out.println("Sua conta foi registrada com sucesso!");

        operacoes();
    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if (contasBancarias.size() > 0) {
            for (Conta contaa : contasBancarias) {
                if (contaa.getNumeroConta() == numeroConta) {
                    conta = contaa;
                }
            }
        }
        return conta;
    }

    public static void depositar() {
        if (contasBancarias.size() > 1) {
            System.out.println("Digite o número da conta: ");
            int numeroConta = teclado.nextInt();
            Conta conta = encontrarConta(numeroConta);

            if (conta != null) {
                System.out.println("Digite o valor do depósito: ");
                Double valorDeposito = teclado.nextDouble();

                conta.depositar(valorDeposito);
            } else {
                System.out.println("Conta não encontrada");
            }
            operacoes();
        } else {
            System.out.println("Opção indisponível!");
        }
    }

    public static void sacar() {
        if (contasBancarias.size() > 0) {
            System.out.println("Número da conta: ");
            int numeroConta = teclado.nextInt();

            Conta conta = encontrarConta(numeroConta);

            if (conta != null) {
                System.out.println("Digite o valor do saque: ");
                Double valorSaque = teclado.nextDouble();

                conta.sacar(valorSaque);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Conta não encontrada");
            }
            operacoes();
        } else {
            System.out.println("Opção indisponível!");
        }
    }
}
