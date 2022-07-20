/*Sabendo que um veículo está a uma velocidade constante de 15m/s, quantos
quilômetros o veículo percorrerá em 50 minutos? Faça um programa que
faça o cálculo utilizando a equação do movimento retilíneo uniforme.*/
// X = X0 + v.t
public class questao12 {
    public static void main(String[] args) {
        int X0 = 0;
        int v = 15;
        int t = 50;
        t = 50*60;
        int x = X0 + v*t;
        x = x/1000;
        System.out.println("Distância: " + x + " Km");
    }
}
