package LP1EstruturaDeDados;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exer90 {
    public static void main(String[] args) {
        List<Integer> lista  = new LinkedList<>();
        Random aleatorio = new Random();
        int numero = 15;
        int count = 0;
        for(int i = 0; i < 30; i++){
            int numeroAle = aleatorio.nextInt(10,20);
            lista.add(numeroAle);
            if( numeroAle == numero){
                count++;
            }
        }
        System.out.println(lista);
        System.out.println(count);
    }
}
