/*Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha
válida é o número 1234. Devem ser impressas as seguintes mensagens:*/
/*ACESSO PERMITIDO caso a senha seja válida.
ACESSO NEGADO caso a senha seja inválida.*/

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int senhaValida = 1234;
        System.out.print("Digite a senha (em números): ");
        int senhaUsuario = teclado.nextInt();
        String conferir = (senhaValida == senhaUsuario)?"ACESSO PERMITIDO":"ACESSO NEGADO";
            System.out.println(conferir);
    }
    
}
