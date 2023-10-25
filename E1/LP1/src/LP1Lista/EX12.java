package LP1Lista;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double f = in.nextDouble();
        double c = 5*(f -32)/9;
        System.out.println("A temperatura em Celsius é:" + c);
    }
}
