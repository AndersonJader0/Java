package Projetos;
/*PROBLEMA
Para a educação fisica, hospitais e postos de saúde, os profissionais calculam um Índice corporal, 
chamado IMC (Índice de Massa Corpórea). Nós queremos otimizar o serviço e ao invés de usar uma
calculadora padrão, queremos um programa q faça essa conta para gente, ganhando tempo.
Precisamos que apareça: nome da pessoa, sexo da pessoa, idade da pessoa e o IMC da pessoa.*/

import javax.swing.JOptionPane;

    public class IMC  {

        public static void main(String[] args) {

        String Name, Sex;
        int age;
        Double height, weight, imc;

        JOptionPane.showMessageDialog(null, "Esse é um programinha para calcular o IMC - (Índice de Massa Corporal).");
        
        Name = JOptionPane.showInputDialog("Digite o nome");
        Sex = JOptionPane.showInputDialog("Digite o sexo");
        age = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros"));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso em kg"));

        imc = weight/(height*2);

        if (imc <= 18.5) {

            JOptionPane.showMessageDialog(null, "Dados"
            + "\nName: " + Name
            + "\nSex: " + Sex
            + "\nAge: " + age
            + "\nIMC: " + imc
            + "\nClassification: Thinnes" 
            );
        }else if (imc >= 25) {

            JOptionPane.showMessageDialog(null, "Dados"
            + "\nNome: " + Name
            + "\nSexo: " + Sex
            + "\nIdade: " + age
            + "\nIMC: " + imc
            + "\nClassification: Obesity"
            );
        }else if (imc <= 25 && imc >=18.5) {

            JOptionPane.showMessageDialog(null, "Dados"
            + "\nNome: " + Name
            + "\nSexo: " + Sex
            + "\nIdade: " + age
            + "\nIMC: " + imc
            + "\nClassification: Normal"
            );
        }
    }
}