/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que
recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
e o salário do funcionário, com duas casas
decimais.*/

package seção04_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class exercicio04 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("What's your number?");
        double number = input.nextDouble();
        System.out.println("how many hours worked?");
        double hours = input.nextDouble();
        System.out.println("How much do you get paid per hour? ");
        double hourlyAge = input.nextDouble();

        System.out.println("Number: "+ number);
        double salario = hours * hourlyAge;
        System.out.printf("salary: U$ %.2f%n ", salario);

        input.close();
    }
}
