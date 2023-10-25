package LP1EstruturaDeDados;

import java.util.*;

public class Exer87 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int i = 0;
        do{
            lista.add(aleatorio.nextInt(20,40));
            i++;
        }while( i <10 );
        int numero = sc.nextInt();
        lista.add(numero);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
