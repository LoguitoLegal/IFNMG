/*4. Construa um programa que imprima a Tabuada da divisão e multiplicação
de um determinando inteiro informado pelo usuário. A tabuada deve
apresentar das operações e os resultados entre o número e os números
do intervalo entre 1 e 10.*/

import java.util.Scanner;

public class questao4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número para ver sua tabuada: ");
        int numero = teclado.nextInt();
        System.out.println("----TABUADA DA DIVISÃO DO NÚMERO " + numero + "----");
        for (int contador = 1; contador <=10; contador++){
            System.out.printf("%d / %d = %.2f\n",numero,contador,((double)numero/contador));
        } System.out.println("----TABUADA DA MULTIPLICAÇÃO DO NÚMERO " + numero + "----"); 
        for (int contador2 = 1; contador2 <=10; contador2++){
            System.out.printf("%d * %d = %d\n",numero,contador2,(numero*contador2));
        }
        System.out.println("----FIM DO PROGRAMA----");
    }
}
