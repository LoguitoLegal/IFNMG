/*5. O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto
de todos os seus antecessores, incluindo si próprio e excluindo o zero. Exemplo de número
fatorial: 6! = 6 x 5 x 4 x 3 x 2 x 1 = 720. Construa um programa que solicite do usuário um número
e imprima o seu fatorial.*/

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        StringBuilder fatorial = new StringBuilder("");
        long fatorialRes = 1;
        System.out.print("Informe um número inteiro para descobrir seu fatorial: ");
        int numero = teclado.nextInt();
        for (int contador = numero; contador>0; contador--) {
            fatorial.append(contador).append(" x ");
            fatorialRes *= contador;
        }
        System.out.println(numero+"! = " + fatorial.replace((fatorial.length()-2), (fatorial.length()), "") + "= " + fatorialRes);
    }
    
}
