package ProjectLogin;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleLogin {
    static Scanner keyboard = new Scanner(System.in);
    static ArrayList<User> LoginUser;

    public static void main(String[] args) {
        LoginUser = new ArrayList<User>();
        ScreenInitial();
    }

    public static void ScreenInitial() {
        System.out.print("""
                Olá o que deseja realizar?
                1 - Login
                2 - Cadastro
                3 - Ver perfil
                4 - Ver Score
                5 - Sair
                """);

        int options = keyboard.nextInt();

        switch (options) {
            case 1:
                login();
                break;
            case 2:
                cadastro();
                break;
            case 3:
                //verPerfil();
                break;
            case 4:
                //verScore();
                break;
            case 6:
                System.out.println("Encerrando sistema!");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
                ScreenInitial();
                break;
        }
    }
        public static void cadastro() {
        System.out.println("Digite o nome de usuário: ");
        String name = keyboard.next();
        System.out.print("Digite a senha: ");
        int senha = keyboard.nextInt();
        User user = new User(name, senha);
        LoginUser.add(user);
        ScreenInitial();
        }
        public static void login() {
        System.out.println("Digite o nome: ");
        String name = keyboard.next();
        System.out.println("Digite a senha: ");
        int senha = keyboard.nextInt();
       User user = new User(name, senha);
       LoginUser.add(user);
       if(user.equals(user)){
           System.out.println("The game started!");
       } else {
           System.out.println("Não foi possível realizar o login!");
       }
    }
}
