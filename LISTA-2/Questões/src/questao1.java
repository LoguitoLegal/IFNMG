//1. Escrever um programa para exibir os números de 1 até 50 na tela.
import java.util.*;

public class questao1 {
    public static void main(String[] args) {
        List numeros = new ArrayList();
        for (int contagem = 1; contagem<=50; contagem++) {
            numeros.add(contagem);
        }
        String cinquenta = numeros.toString();
        System.out.println(cinquenta.replace("[", "").replace("]", ""));
    }
}
