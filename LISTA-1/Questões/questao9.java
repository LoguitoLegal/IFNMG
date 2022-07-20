/*Escreva um programa que receba o valor da cotação do dólar em reais, em seguida receba um
determinado valor em real e faça a conversão. Imprima o resultado.*/

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a cotação do dólar atual: ");
        double cotacaoDolarAtual = teclado.nextDouble();
        System.out.print("Reais a serem convertidos em Dólar: ");
        double reais = teclado.nextDouble();
        System.out.println("R$ " + reais + " = $ " + (reais/cotacaoDolarAtual));
        //mt dificil arredondar :(
    }
}
