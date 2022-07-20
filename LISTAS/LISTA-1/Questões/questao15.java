
import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu peso (em Kg): ");
        float peso = teclado.nextFloat();
        System.out.println("Digite sua altura (em metros): ");
        float altura = teclado.nextFloat();
        float IMC = peso/(altura*altura);
        if (IMC<18.5) {
            System.out.println("Magreza");
        } else if (IMC>=18.5 && IMC<=24.9) {
            System.out.println("Saudável");
        } else if (IMC>=25 && IMC <=29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC>=30 & IMC<=34.9) {
            System.out.println("Obesidade grau 1");
        } else if (IMC>=35 && IMC<=39.9) {
            System.out.println("Obesidade grau 2 (severa)");
        } else if (IMC>=40) {
            System.out.println("Obesidade grau 3 (morbida)");
     }
    }
    
}
