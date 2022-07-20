/*Escreva um programa que solicite o nome, sobrenome, endereço, cidade e estado do usuário e
em seguida imprima os dados como no exemplo abaixo:
Nome: Antônio da Silva
Endereço: Rua Bonita, no 99 – Almenara - MG*/

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = teclado.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        String sobreNome = teclado.nextLine();
        
        System.out.print("Digite a sigla do seu estado: ");
        String estado = teclado.nextLine();
        
        System.out.print("Digite sua cidade: ");
        String cidade = teclado.nextLine();
        
        System.out.print("Digite seu endereço: ");
        String endereco = teclado.nextLine();
        /*OBS: não coloquei a ordem que estava na questão, pois para mim faz
        mais sentido estar nesta ordem que coloquei*/
        System.out.println("Nome: " + primeiroNome + " " + sobreNome);
        System.out.println("Endereço: " + endereco + " - " + cidade + " - " + estado);
    }
}
