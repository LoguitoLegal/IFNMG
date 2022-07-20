
import java.util.Scanner;

//Escreva um programa que receba dois inteiros e informe qual o maior deles.

public class questao14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o primeiro valor inteiro: ");
        int valor1 = teclado.nextInt();
        System.out.print("Informe o segundo valor inteiro: ");
        int valor2 = teclado.nextInt();
        if (valor1>valor2) {
            System.out.println("O primeiro valor é o maior: "+valor1);
        } else if (valor1==valor2){
            System.out.println("Ambos os valores são iguais");
        } else {
            System.out.println("O segundo valor é o maior: "+valor2);
        }
    }
}
