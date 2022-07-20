/*3. Construa um programa que solicite infinitos números inteiros ao usuário, e ao informar o valor
“0”, o programa imprima quantos números pares foram digitados.*/
 
import java.util.*;

public class questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List lista = new ArrayList();
        int totalPares = 0;
        System.out.print("Digite um valor inteiro (0 para encerrar): ");
        int numero = teclado.nextInt();
        if (numero != 0 && numero%2==0) {
            lista.add(numero);
            totalPares = 1;
        }
        while (numero != 0) {
            System.out.print("Digite outro valor inteiro (0 para encerrar): ");
            numero = teclado.nextInt();
            if (numero%2==0 && numero != 0) {
                lista.add(numero);
                totalPares+=1;
            }
        }
        String listaFinal;
        listaFinal = lista.toString();
        System.out.println("---FIM DO PROGRAMA---");
        System.out.println("Total de números pares digitados: " + totalPares);
        System.out.println("Números pares digitados: " + listaFinal.replace("[", "").replace("]", ""));
    }
}
