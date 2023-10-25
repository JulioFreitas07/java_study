package LP1Lista;

public class EX6 {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        System.out.println(retangulo1.calcular(5.0, 4.0));

    }
}
class Retangulo{
    public double calcular(double largura, double altura ){
        return largura * altura;
    }
}
