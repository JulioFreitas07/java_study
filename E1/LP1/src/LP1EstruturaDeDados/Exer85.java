package LP1EstruturaDeDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exer85 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        ArrayList<Integer> temperatura = new ArrayList<>();

        for(int i = 0; i < 360; i++){
            temperatura.add(aleatorio.nextInt(25,40));
        }
        // Menor temperatura
        int menorTemperatura = Collections.max(temperatura);
        // Maior temperatura
        int maiorTemperature = Collections.min(temperatura);
        // Calculando a média
        double media = (temperatura
                .stream()
                .mapToDouble(Integer::doubleValue)
                .sum())/temperatura.size();
        // notas maiores que a média
        Stream<Integer> maiorQueMedia = temperatura
                .stream()
                .filter(e -> e < media);
        List<Integer> listaMaiorQueMedia = maiorQueMedia.collect(Collectors.toList());
        System.out.println(menorTemperatura);
        System.out.println(maiorTemperature);
        System.out.println(media);
        System.out.println(listaMaiorQueMedia);
    }
}
