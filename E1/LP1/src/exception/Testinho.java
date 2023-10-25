package exception;

public class Testinho {
    public static void main(String[] args) {
        Banco banco = new Banco();
        try {
            banco.ConexaoBanco();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("oi");

    }
}
