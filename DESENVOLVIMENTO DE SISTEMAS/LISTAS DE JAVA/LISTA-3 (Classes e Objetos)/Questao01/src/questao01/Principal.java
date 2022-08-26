
package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Criando objeto aluno
        Aluno aluno1 = new Aluno();
        
        //Entrando com informações
        System.out.print("Nome do aluno: ");
        aluno1.nome = teclado.nextLine();
        
        System.out.print("Matrícula do aluno: ");
        aluno1.matricula = teclado.nextInt();
        
        System.out.print("Nota da prova 1: ");
        aluno1.prova1 = teclado.nextDouble();
        
        System.out.print("Nota da prova 2: ");
        aluno1.prova2 = teclado.nextDouble();
        
        System.out.print("Nota da prova 3: ");
        aluno1.prova3 = teclado.nextDouble();
        
        System.out.print("Nota do trabalho: ");
        aluno1.trabalho = teclado.nextDouble();
        
        //Cálculo
        double media = aluno1.mediaAluno();
        
        //Imprimindo resultado
        System.out.printf("Média final do aluno %s: %.2f\n",aluno1.nome, media);
    }
}
