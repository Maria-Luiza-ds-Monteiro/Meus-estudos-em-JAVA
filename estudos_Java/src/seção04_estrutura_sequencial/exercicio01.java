//Exercicio 01: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

package seção04_estrutura_sequencial;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //O new dá vida ao objeto.
        //new é o que chamamos de "construtor"
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        int numero2 = input.nextInt();

        int soma = numero1 + numero2;

        System.out.println("O resultado da soma dos valores: "+ numero1+ " e " + numero2+ " é: "+soma+ ".");

        input.close();
    }
}
