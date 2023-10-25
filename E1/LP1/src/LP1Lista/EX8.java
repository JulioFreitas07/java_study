package LP1Lista;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean votacao = true;
        int nulo = 0;
        int branco = 0;
        int outros = 0;
        String voto;

        do{
            voto = in.next();
            if(voto.equals("nulo")){
                nulo++;

            }else if(voto.equals("branco")){
                branco++;

            }else if(voto.equals("outros")){
                outros++;
            }else{
                votacao = false;
            }
        }while(votacao);

        int soma = nulo + branco + outros;
        System.out.println(soma);
        System.out.println("Porcentagem de nulos" + nulo/soma);
        System.out.println("Porcentagem de branco" + branco/soma);
        System.out.println("Porcentagem de outros" + outros/soma);
    }
}
