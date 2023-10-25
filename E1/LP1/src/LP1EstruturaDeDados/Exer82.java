package LP1EstruturaDeDados;

public class Exer82 {
    public static void main(String[] args) {
        Integer[] a = {8,5,13,56,3,2,98,54,90,82};
        Integer[] m = new Integer[10];
        int x = 5;
        int i = 0;
        for(Integer y : a){
            m[i] = y*x;
            i++;
        }
    }
}
