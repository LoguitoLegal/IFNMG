/*Escreva um programa que receba dois números decimais, armazene a soma dos dois em uma
nova variável e em seguida imprima o resultado.*/

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro valor decimal: ");
        float valor1 = teclado.nextFloat();
        System.out.print("Segundo valor decimal: ");
        float valor2 = teclado.nextFloat();
        float resultado = valor1 + valor2;
        System.out.println("Resultado: " + resultado);
    }
}
