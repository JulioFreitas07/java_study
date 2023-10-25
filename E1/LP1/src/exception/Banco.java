package exception;

public class Banco {
    private boolean con = false;
    private boolean internet = false;
    public void ConexaoBanco() throws Exception {
        if(this.internet) {
            this.con = true;
            System.out.println("Banco conectado");
        }else {
            throw new Exception("Deu ruim");
        }
    }
}
