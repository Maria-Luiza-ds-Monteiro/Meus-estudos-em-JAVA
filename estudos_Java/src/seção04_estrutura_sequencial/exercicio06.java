/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

package secao04_estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangle = (A * C) / 2.0;
        double circle = 3.14159 * Math.pow(C, 2);
        double trapezoid = ((A + B) * C) / 2.0;
        double square = Math.pow(B, 2);
        double rectangle = A * B;

        System.out.printf("TRIANGLE: %.3f%n", triangle);
        System.out.printf("CIRCLE: %.3f%n", circle);
        System.out.printf("TRAPEZOID: %.3f%n", trapezoid);
        System.out.printf("SQUARE: %.3f%n", square);
        System.out.printf("RECTANGLE: %.3f%n", rectangle);

        sc.close();
    }
}