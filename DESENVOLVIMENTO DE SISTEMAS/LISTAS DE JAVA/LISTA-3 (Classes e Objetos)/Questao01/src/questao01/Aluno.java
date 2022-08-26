
package questao01;

public class Aluno {
    String nome;
    int matricula;
    double prova1;
    double prova2;
    double prova3;
    double trabalho;
    
    
    double mediaAluno (){
    double media = (this.prova1 * 2 + this.prova2 * 2 + this.prova3 * 2 + this.trabalho * 1.5)/7.5;
    return media;
    }

}
