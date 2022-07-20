//Escreva um programa que receba três inteiros e informe qual o menor deles.

import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros = 0;
        System.out.print("Digite o primeiro valor inteiro: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int numero2 = teclado.nextInt();
        System.out.print("Digite o terceiro valor inteiro: ");
        int numero3 = teclado.nextInt();
        if (numero2<numero1 && numero2<numero3) {
            System.out.println("O menor valor é o segundo: " + numero2);
        } else if (numero1<numero3 && numero1<numero2) {
            System.out.println("O menor valor é o primeiro: " + numero1);
        } else if (numero3<numero2 && numero3<numero1) {
            System.out.println("O menor valor é o terceiro: " + numero3);
        } else {
            System.out.println("Os valores são iguais.");
        }
    }
}
