package LP1Lista;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario = in.nextDouble();
        double reajuste = salario*(1 + 0.10);
        System.out.println(reajuste);
    }
}
