package LP1EstruturaDeDados;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exer86 {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        Random aleatorio = new Random();
        for(int i = 0; i < 10; i++){
            lista.add(aleatorio.nextInt(10, 20));
        }
        Collections.sort(lista);
        System.out.println(lista);
    }
}
