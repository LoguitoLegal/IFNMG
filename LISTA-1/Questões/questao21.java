/*Escreva um programa que leia as medidas dos lados de um triângulo e
escreva se ele é equilátero, isósceles ou escaleno.*/

import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira medida: ");
        double medida1 = teclado.nextDouble();
        System.out.print("Segunda medida: ");
        double medida2 = teclado.nextDouble();
        System.out.print("Terceira medida: ");
        double medida3 = teclado.nextDouble();
        if (medida1 == medida2 && medida2 == medida3) {
            System.out.println("O triângulo é Equilátero");
        } else if (medida1 == medida2 && medida2 != medida3 || medida1 == medida3 && medida3 != medida2 
                || medida2 == medida3 && medida3 != medida1) {
            System.out.println("O triângulo é Isósceles");
        } else if (medida1 != medida2 && medida1 != medida3 && medida2 != medida3) {
            System.out.println("O triângulo é Escaleno");
        }
    }
    
}
