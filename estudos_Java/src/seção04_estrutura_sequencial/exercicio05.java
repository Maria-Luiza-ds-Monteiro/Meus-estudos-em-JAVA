/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário
de cada peça 1, o código de uma peça 2, o número de peças 2 e
 o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

package seção04_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class exercicio05 {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double totalgerar = 0;

        for(int i = 0; i < 2; i++){
            System.out.println("Part code "+ (i+1)+":");
            int code = input.nextInt();
            System.out.println("Part number "+ (i+1)+"?");
            int number = input.nextInt();
            System.out.println("unit price of each piece" + (i+1)+"?");
            double price = input.nextDouble();

            totalgerar = totalgerar + (number * price);
        }

        System.out.printf("Amount to pay: %.2f%n", totalgerar);
        input.close();
    }

}
