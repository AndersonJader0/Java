import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float weightedAverage, gradesTyped;

        int quantityGrades;

        System.out.println("Digite a quantidade de notas para efetuar a média ponderada/máximo 5");
        quantityGrades = keyboard.nextInt();
        float[] theGrades = new float[quantityGrades];
        float[] gradeWeight = new float[quantityGrades];
        float[] calculate = new float[quantityGrades];

        int i;
        int numeration;
        for (i = 0; i < quantityGrades; i++) {
            numeration = i + 1;
            System.out.println("Digite a " + numeration + "a nota: ");
            gradesTyped = keyboard.nextInt();
            theGrades[i] = gradesTyped;
        }

        int i2;
        int numeration2;
        for (i2 = 0; i2 < quantityGrades; i2++) {
            numeration2 = i2 + 1;
            System.out.println("Digite o peso da " + numeration2 + "a nota:");
            float typedGradeWeight = keyboard.nextFloat();
            gradeWeight[i2] = typedGradeWeight;
        }

        if (quantityGrades == 5) {
            int i3;
            for (i3 = 0; i3 < 5; i3++) {
                calculate[i3] = theGrades[i3] * gradeWeight[i3];
                if (i3 == 4) {
                    weightedAverage = (calculate[0] + calculate[1] + calculate[2] + calculate[3] + calculate[4])
                            / (gradeWeight[0] + gradeWeight[1] + gradeWeight[2] + gradeWeight[3] + gradeWeight[4]);
                    System.out.println("|-------------------------------------|"
                            + "\n|-----------Tabela de notas-----------|"
                            + "\n|-------------------------------------|"
                            + "\n| Nota1: " + theGrades[0]
                            + "\n| Nota2: " + theGrades[1]
                            + "\n| Nota3: " + theGrades[2]
                            + "\n| Nota4: " + theGrades[3]
                            + "\n| Nota5: " + theGrades[4]
                            + "\n| Média: " + weightedAverage);
                }
            }
        }
        if (quantityGrades == 4) {
            int i3;
            for (i3 = 0; i3 < 4; i3++) {
                calculate[i3] = theGrades[i3] * gradeWeight[i3];
                if (i3 == 3) {
                    weightedAverage = (calculate[0] + calculate[1] + calculate[2] + calculate[3])
                            / (gradeWeight[0] + gradeWeight[1] + gradeWeight[2] + gradeWeight[3]);
                    System.out.println("|-----------------------------------|"
                            + "\n|----------Tabela de notas----------|"
                            + "\n|-----------------------------------|"
                            + "\n| Nota1: " + theGrades[0]
                            + "\n| Nota2: " + theGrades[1]
                            + "\n| Nota3: " + theGrades[2]
                            + "\n| Nota4: " + theGrades[3]
                            + "\n| Média: " + weightedAverage);
                }
            }
        }
        if (quantityGrades == 3) {
            int i3;
            for (i3 = 0; i3 < 3; i3++) {
                calculate[i3] = theGrades[i3] * gradeWeight[i3];
                if (i3 == 2) {
                    weightedAverage = (calculate[0] + calculate[1] + calculate[2])
                            / (gradeWeight[0] + gradeWeight[1] + gradeWeight[2]);
                    System.out.println("|-----------------------------------|"
                            + "\n|----------Tabela de notas----------|"
                            + "\n|-----------------------------------|"
                            + "\n| Nota1: " + theGrades[0]
                            + "\n| Nota2: " + theGrades[1]
                            + "\n| Nota3: " + theGrades[2]
                            + "\n| Média: " + weightedAverage);
                }
            }
        }
        if (quantityGrades == 2) {
            int i3;
            for (i3 = 0; i3 < 2; i3++) {
                calculate[i3] = theGrades[i3] * gradeWeight[i3];
                if (i3 == 1) {
                    weightedAverage = (calculate[0] + calculate[1])
                            / (gradeWeight[0] + gradeWeight[1]);
                    System.out.println("|-----------------------------------|"
                            + "\n|----------Tabela de notas----------|"
                            + "\n|-----------------------------------|"
                            + "\n| Nota1: " + theGrades[0]
                            + "\n| Nota2: " + theGrades[1]
                            + "\n| Nota3: " + theGrades[2]
                            + "\n| Média: " + weightedAverage);
                }
            }
        }
    }
}