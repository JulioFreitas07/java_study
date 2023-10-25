package LP1EstruturaDeDados;

public class Exer77 {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        vetor[0] = 5;
        vetor[1] = 1;
        vetor[2] = 4;
        vetor[3] = 2;
        vetor[4] = 7;
        vetor[5] = 8;
        vetor[6] = 3;
        vetor[7] = 6;
        int aux;
        int[] v = new int[8];
        for(int i = 8; i>=5; i--){
            aux = v[i];
            v[i] = v[8 -i +1];
            v[8 - i + 1] = aux;
        }
        v[3] = v[1];
        v[v[3]] = v[v[2]];

        System.out.println(v);
    }

}
