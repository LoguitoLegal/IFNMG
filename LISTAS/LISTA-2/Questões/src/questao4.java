/*4. Construa um programa que exiba um menu com 4 opções: 1 - Somar, 2 – Subtrair,
3- Multiplicar e 4 – Dividir e 5 - Sair. Ao escolher uma das opções entre 1 e 4 o
programa deve solicitar que o usuário informe dois números, calcular a operação
escolhida e imprimir o resultado e apresentar o menu novamente. Ao selecionar a
opção 5 o programa deve ser finalizado.*/

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        String opcoes = "Selecione uma opção:\n 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Sair \nDigite: ";
        Scanner teclado = new Scanner(System.in);
        System.out.print(opcoes);
        int opcao = teclado.nextInt();
        while (opcao != 5){
            while (opcao == 1) {
                System.out.println("--SOMAR--");
                System.out.print("Valor 1: ");
                double valor1 = teclado.nextDouble();
                System.out.print("Valor 2: ");
                double valor2 = teclado.nextDouble();
                System.out.println("---Resultado: "+(valor1+valor2)+"---");
                System.out.print(opcoes);
                opcao = teclado.nextInt();
            } while (opcao == 2) {
                System.out.println("--SUBTRAIR--");
                System.out.print("Valor 1 (minuendo): ");
                double valor1 = teclado.nextDouble();
                System.out.print("Valor 2 (subtraendo): ");
                double valor2 = teclado.nextDouble();
                System.out.println("---Resultado: "+(valor1-valor2)+"---");
                System.out.print(opcoes);
                opcao = teclado.nextInt();
            } while (opcao == 3) {
                System.out.println("--MULTIPLICAR--");
                System.out.print("Valor 1: ");
                double valor1 = teclado.nextDouble();
                System.out.print("Valor 2: ");
                double valor2 = teclado.nextDouble();
                System.out.println("---Resultado: "+(valor1*valor2)+"---");
                System.out.print(opcoes);
                opcao = teclado.nextInt();
            } while (opcao == 4) {
                System.out.println("--DIVIDIR--");
                System.out.print("Valor 1 (dividendo): ");
                double valor1 = teclado.nextDouble();
                System.out.print("Valor 2 (divisor): ");
                double valor2 = teclado.nextDouble();
                System.out.println("---Resultado: "+(valor1/valor2)+"---");
                System.out.print(opcoes);
                opcao = teclado.nextInt();
            }
        }
        System.out.println("---PROGRAMA FINALIZADO---");
    }
}
