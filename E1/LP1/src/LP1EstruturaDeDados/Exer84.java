package LP1EstruturaDeDados;

import java.util.Random;

public class Exer84 {
    public static void main(String[] args) {
        int tamanho = 5;
        Random aleatorio = new Random();
        Integer[] a = new Integer[tamanho];
        Integer[] b = new Integer[tamanho];
        Integer[] soma = new Integer[tamanho];
        for(int i = 0; i < 5; i++){
            a[i] = aleatorio.nextInt(10);
        }
        for(int i = 0; i < 5; i++){
            b[i] = aleatorio.nextInt(50);
        }
        for(int i = 0; i < 5; i++){
            soma[i] = a[i]+b[i];
        }

    }
}
