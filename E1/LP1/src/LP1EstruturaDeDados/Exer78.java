package LP1EstruturaDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer78 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 10; i++){
            String nome = sc.nextLine();
            nomes.add(nome.toUpperCase());
        }
        System.out.println("Digite o nome de busca");
        String nomeConsulta = sc.nextLine();
        for(String nominho : nomes){
            if (nominho.equals(nomeConsulta.toUpperCase())) {
                System.out.println("Achei");
                return;
            }

        }
        System.out.println("Não Achei");
    }
}
