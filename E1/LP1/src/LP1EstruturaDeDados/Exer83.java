package LP1EstruturaDeDados;

import java.util.Random;
import java.util.Stack;

public class Exer83 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Random numeroAleatorio = new Random();

        for(int i = 0; i <10; i++){
            pilha.push(numeroAleatorio.nextInt(30));
        }
        do{
            pilha.pop();
            System.out.println(pilha.pop());

        }while(!pilha.isEmpty());
    }
}
