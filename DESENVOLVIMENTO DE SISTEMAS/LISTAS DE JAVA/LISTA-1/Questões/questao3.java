/*Escreva um programa que receba dois números inteiros e imprima o resultado da
divisão inteira entre os números bem como o resto dessa divisão.*/

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro valor inteiro: ");
        int valor1 = teclado.nextInt();
        System.out.print("Segundo valor inteiro: ");
        int valor2 = teclado.nextInt();
        int divInt = valor1/valor2;
        float divSobra = valor1 % valor2;
        System.out.println("Divisão inteira entre os dois valores: " + divInt);
        System.out.println("Sobra da divisão entre os dois valores: " + divSobra);
    }
}
