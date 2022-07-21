//Escreva um programa que receba um número e informe se o número é par ou ímpar.

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        float num = teclado.nextFloat();
        if (num%2 == 0){
            System.out.println("O número é par");
        } else
            System.out.println("O número é impar");
    }
}
