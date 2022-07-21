/*3. Construa um programa conversor de escalas de temperaturas. O usuário deverá escolher de
qual escala para qual escala deseja fazer a conversão, solicitar o valor e em seguida imprimir o
valor correspondente na nova escala:*/
/*1. Celsius para Kelvin
2. Celsius para Fahrenheit
3. Fahrenheit para Celsius
4. Kelvin para Celsius
5. Fahrenheit para Kelvin
6. Kelvin para Fahrenheit
7. Sair do Programa*/

import java.util.Scanner;

public class questao3_2 { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Graus;
        System.out.println("--Escola o número correspondente da escala de conversão--");
        System.out.print(" 1 - Celsius para Kelvin\n 2 - Celsius para Fahrenheit\n 3 - Fahrenheit para Celsius\n 4 - Kelvin para Celsius"
                + "\n 5 - Fahrenheit para Kelvin\n 6 - Kelvin para Farenheit\n 7 - Sair do programa\nDigite: ");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("--CELSIUS PARA KELVIN--");
                System.out.print("Celsius: ");
                Graus = teclado.nextInt();
                System.out.printf("%.2f Celsius = %.2f Kelvin\n",Graus,(Graus+273.15));
                break;
            case 2:
                System.out.println("--CELSIUS PARA FAHRENHEIT--");
                System.out.print("Celsius: ");
                Graus = teclado.nextInt();
                System.out.printf("%.2f Celsius = %.2f Fahrenheit\n",Graus,(Graus*1.8+32));
                break;
            case 3:
                System.out.println("--FAHRENHEIT PARA CELSIUS--");
                System.out.print("Fahrenheit: ");
                Graus = teclado.nextInt();
                System.out.printf("%.2f Fahrenheit = %.2f Celsius\n",Graus,((Graus-32)/1.8));
                break;
            case 4:
                System.out.println("--KELVIN PARA CELSIUS--");
                System.out.print("Kelvin: ");
                Graus = teclado.nextInt();
                System.out.printf("%.2f Kelvin = %.2f Celsius\n",Graus,(Graus-273.15));
                break;
            case 5:
                System.out.println("--FAHRENHEIT PARA KELVIN--");
                System.out.print("Fahrenheit: ");
                Graus = teclado.nextInt();
                System.out.printf("%.2f Fahrenheit = %.2f Kelvin\n",Graus,((Graus-32)*5/9+273.15));
                break;
            case 6:
                System.out.println("--KELVIN PARA FAHRENHEIT--");
                System.out.print("Kelvin: ");
                Graus = teclado.nextInt();
                System.out.printf("%.2f Kelvin = %.2f Fahrenheit\n",Graus,((Graus-273.15)*9/5+32));
            default:
                break;
        }
        System.out.println("--FIM DO PROGRAMA--");
    }
}
