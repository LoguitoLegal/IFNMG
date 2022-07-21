/*1. Uma pizzaria fornece 10% de desconto para funcionários e 5% de desconto para clientes vips.
Faça um programa que calcule o valor total a ser pago pela venda de uma pizza. O programa
deverá ler o valor da compra e um código que indica o tipo de cliente: 1-Comum, 2-Vip e 3-
Funcionário.*/

import java.util.Scanner;

public class questao1_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double desconto;
        System.out.print("Informe o valor da pizza: ");
        double valorPizza = teclado.nextDouble();
        System.out.println("Informe o número correspondende do tipo de cliente ");
        System.out.print(" 1 - Comum \n 2 - Vip \n 3 - Funcionario \nDigite: ");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 2:
                desconto = (0.05*valorPizza);
                System.out.printf("Valor total: R$%.2f \n",(valorPizza-desconto));
                System.out.printf("Desconto: R$%.2f \n",desconto);
                break;
            case 3:
                desconto = (0.1*valorPizza);
                System.out.printf("Valor total: R$%.2f \n",(valorPizza-desconto));
                System.out.printf("Desconto: R$%.2f \n",desconto);
                break;
            default:
                System.out.println("Valor total: R$"+valorPizza);
                System.out.println("Desconto: R$0,00");
                break;
        }
    }
}
