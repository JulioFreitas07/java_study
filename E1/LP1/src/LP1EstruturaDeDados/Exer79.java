package LP1EstruturaDeDados;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exer79 {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        // Leitura de 20 alunos
        for(int i = 0; i <20; i++){
            int nota = sc.nextInt();
            lista.add(nota);
        }
        //Media dos alunos
        double media = (lista
                .stream()
                .mapToInt(Integer::intValue)
                .sum())/3;
        // Valores maiores que 4
        List<Integer> valoresMaiorMedia =  lista
                        .stream()
                        .filter(value -> value > media)
                        .collect(Collectors.toList());
        System.out.println(valoresMaiorMedia);
        System.out.println("quantidade de alunos maior que a média" +  valoresMaiorMedia.size());
        System.out.println(media);

    }
}
