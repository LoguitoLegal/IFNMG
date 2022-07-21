/*Sabendo que uma pedra cai com uma aceleração 20,2m/s2, faça um
programa que solicite do usuário uma duração (tempo) em minutos e calcule a
altura necessária para que ao ser largada a pedra caia e atinja o solo no tempo
informado pelo usuário.*/

import java.util.Scanner;
public class questao13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tempo em minutos: ");
        double minutos = teclado.nextInt();
        double g = 20.2; //20,2m/s2
        double t = minutos * 60; // converter para segundos
        double H = (g*(t*t))/2; // formula
        double conversao = H/1000; // m para Km
        System.out.println("A altura necessária para que o objeto caia em "+minutos+" minutos é: "+conversao+" Km");
        
        //eu n sei fisica Leonaaaaaaaaaaaan
    }
}
