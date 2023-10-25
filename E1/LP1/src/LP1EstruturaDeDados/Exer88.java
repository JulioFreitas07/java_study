package LP1EstruturaDeDados;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Exer88 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new TreeSet<>();
        Random aleatorio = new Random();
        for(int i = 0; i< 20; i++){
            conjunto.add(aleatorio.nextInt(20,60));
        }
        int numero = 34;
        if(conjunto.contains(numero)){
            conjunto.remove(numero);
        }
        System.out.println(conjunto);
    }
}
