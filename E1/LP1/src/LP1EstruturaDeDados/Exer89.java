package LP1EstruturaDeDados;

import java.util.*;

public class Exer89 {
    public static void main(String[] args) {
        Integer[] v1 = new Integer[20];
        Integer[] v2 =  new Integer[20];
        Random aleatorio = new Random();
        Random aleatorio2 = new Random();
        Integer cont = 0;
        for (int i = 0; i<20; i++){
            v1[i] = aleatorio.nextInt(30,80);
            v2[i] = aleatorio2.nextInt(30, 80);

            if(v1[i] == v2[i]){
                cont ++;
            }
        }
        System.out.println(cont);
    }
}
