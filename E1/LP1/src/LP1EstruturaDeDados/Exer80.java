package LP1EstruturaDeDados;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exer80 {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        Random gerador = new Random();
        for(int i = 0; i< 20; i++){
            int numeroSorted = gerador.nextInt();
            lista.add(numeroSorted);
        }
        // maior valor do lista
        int maiorNumero = Collections.max(lista);
        System.out.println(maiorNumero);
        // index do maior valor da lista
        System.out.println(lista.indexOf(maiorNumero));




    }
    
}
