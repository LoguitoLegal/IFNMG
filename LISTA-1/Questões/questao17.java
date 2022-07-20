/*Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem
que diga se ela poderá ou não votar este ano.*/

import java.util.Scanner;
import java.util.Date;
public class questao17 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Date anoSistema = new Date();
        System.out.print("Informe seu ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        int ano = anoSistema.getYear() + 1900;
        int idadeVotar = ano-anoNascimento;
        if (idadeVotar <16) {
            System.out.println("Você só poderá votar caso faça 16 anos neste ano");
        } else if (idadeVotar >= 16 && idadeVotar<18 || idadeVotar>70) {
            System.out.println("O voto é opcional");
        } else if (idadeVotar>=18 && idadeVotar<70) {
            System.out.println("O voto é obrigatório");
        }
    }
}
