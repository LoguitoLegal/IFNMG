/*Reescreva o programa anterior para que solicite do usuário a quantidade de metros que deseja
converter e depois de realizar a conversão informe ao usuário a quantidade de polegadas.*/

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);  
        System.out.print("Metros a serem convertidos em polegadas: ");
        float metros = teclado.nextFloat();
        System.out.println(metros + " metro(s) = " + (metros * 39.3700787) + " polegadas.");
    }   
}
