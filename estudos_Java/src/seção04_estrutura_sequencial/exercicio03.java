/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

package seção04_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class exercicio03 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US); //garante que o sistema reconheça o .
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A = input.nextInt();
        System.out.println("Enter the second number: ");
        int B = input.nextInt();
        System.out.println("Enter the third number: ");
        int C = input.nextInt();
        System.out.println("Enter the fourth number: ");
        int D = input.nextInt();
        //formula
        double difference = (A * B - C * D);
        //essa impressão printf é essencial para formatações %
        //aqui a , é usada no prinln é usado + para concatenar
        System.out.printf("Result = %.2f%n ", difference);

        input.close();
    }

    
}
