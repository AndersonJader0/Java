import java.util.Scanner;

public class IMCs {
    public static void main(String[] args){

        Float altura, peso, imc;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a altura em metros");
        altura = entrada.nextFloat();
        System.out.println("Digite o peso em kg");
        peso = entrada.nextFloat();

        imc = peso/(altura*2);

        System.out.println("O IMC é = " + imc);
    }
}