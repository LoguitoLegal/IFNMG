//Faça um programa que receba uma quantidade de horas e imprima o equivalente em segundos.
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas: ");
        int horas = teclado.nextInt();
        System.out.println(horas + " hora(s) é(são) " + (horas*60*60) + " segundo(s)");
    }
    
}
