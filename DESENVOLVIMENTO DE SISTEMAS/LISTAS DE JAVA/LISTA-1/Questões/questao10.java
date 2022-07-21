//Faça um programa que receba uma quantidade de minutos e imprima o equivalente em horas.

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite a quantidade de minutos: ");
            int minutos = teclado.nextInt();
            System.out.println(minutos + " minuto(s) é(são) " + (minutos/60) + " hora(s)");
    }
}
