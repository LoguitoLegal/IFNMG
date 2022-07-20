/*As laranjas custam R$ 0,50 cada se forem compradas menos do que uma dúzia, e R$ 0,30 se
forem compradas pelo menos doze. Escreva um programa que leia o número de laranjas
compradas, calcule e escreva o valor total da compra.*/

import java.util.Scanner;
   
public class questao19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double valorLaranja = 0;
        System.out.println("Quantas laranjas foram compradas?: ");
        int totalLaranja = teclado.nextInt();
        if (totalLaranja < 12) {
            valorLaranja = 0.50;
            System.out.println("O valor total da compra é: R$ " + (totalLaranja*valorLaranja));
        } else {
            valorLaranja = 0.30;
            System.out.println("O valor total da compra é: R$ " + (totalLaranja*valorLaranja));
        }
    }
}
