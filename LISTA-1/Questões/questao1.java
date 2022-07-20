//Escreva um programa que receba dois inteiros e imprima a soma dos dois valores.

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro valor inteiro: ");
        int valor1 = teclado.nextInt();
        System.out.print("Segundo valor inteiro: ");
        int valor2 = teclado.nextInt();
        System.out.println("Soma dos dois valores: " + (valor1 + valor2));
    }
    
}
