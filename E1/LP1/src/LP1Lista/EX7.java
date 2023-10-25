package LP1Lista;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anos;
        int meses;
        int dias;

        anos = in.nextInt();
        meses = in.nextInt();
        dias = in.nextInt();
        System.out.println(anos*365 + meses*30 + dias );
    }
}
