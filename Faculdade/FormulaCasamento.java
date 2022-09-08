/* 
Nome: Anderson Jader Ferreira Filho
Ra: 52211907
*/

import java.util.Scanner;

public class FormulaCasamento {
    public static void main (String[] args){

        int idade, n, p, calculo; /* "n" = idade máxima e "p" = idade mínima. */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Esse é um programinha para calcular a idade ideal para se casar!"
        + "\nDigite a sua idade: "); 
        idade = entrada.nextInt();

        System.out.println("Estabeleça o limite de idade em que você quer se casar: "); 
        n = entrada.nextInt(); // Idade máxima.

        System.out.println("Pense na menor idade que você se cogitaria subir no altar: ");
        p = entrada.nextInt(); // Idade mínima.

        calculo = (int) ((((n - p) * 0.368) + p));

        System.out.println("A idade ideal para se casar é " + calculo);

        if (calculo == idade){
            System.out.print("Já pode comprar o anel e preparar do discurso!");
        }else if (calculo > idade){
            System.out.print("Ainda está cedo!");
        } else{
            System.out.print("Já passou da época!");
        }
    }
}