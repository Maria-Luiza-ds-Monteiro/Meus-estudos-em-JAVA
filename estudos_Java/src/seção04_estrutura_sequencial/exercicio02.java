/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2

Considere o valor de π = 3.14159*/
package seção04_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class exercicio02 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US); //garante p o sistema o uso de . invés de ,
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Enter a number: ");
        double ray = input.nextDouble();

        double area = pi * (ray * ray);

        System.out.printf("A= %.4f%n", area);

        input.close();
    }
}
