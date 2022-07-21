//Escreva um programa que receba quatro notas de um aluno e imprima a média das notas.

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        float notas = 0;
        Scanner teclado = new Scanner(System.in);
        for (int numContagem=1; numContagem<=4; numContagem++) {
            System.out.print(numContagem + "º " + "nota do aluno: ");
            notas += teclado.nextFloat();
        }
        System.out.println("Média das notas do aluno: " + (notas/4));
    }
    
}
