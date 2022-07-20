//2. Construa um programa para encontrar todos os números pares entre 1 e 100.
import java.util.*;
public class questao2 {
    public static void main(String[] args) {
        int totalPares = 0;
        List listaPares = new ArrayList();
        for (int numeros = 1; numeros<=100; numeros++) {
            if (numeros%2==0) {
                totalPares+=1;
                listaPares.add(numeros);
            }
        }
        String numerosListados = listaPares.toString();
        System.out.printf("Total de números pares entre 1 e 100: %d \n",totalPares);
        System.out.println("Números pares: " + numerosListados.replace("[","").replace("]", ""));
    }
}
