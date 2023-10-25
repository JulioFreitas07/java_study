package LP1EstruturaDeDados;

import java.util.Random;

public class Exer91 {
    public static void main(String[] args) {
        Integer[] vet = new Integer[50];
        Random aleatorio = new Random();
        for(int i = 0; i < 50; i++){
            vet[i] = aleatorio.nextInt(20,80);

        }
        boolean haRepetidos = false;

        for (int i = 0; i < 49; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (vet[i] == vet[j]) {
                    haRepetidos = true;
                    System.out.println("Número repetido encontrado: " + vet[i]);
                    System.out.println("Posições: " + i + " e " + j);
                }
            }
        }

    }
}
