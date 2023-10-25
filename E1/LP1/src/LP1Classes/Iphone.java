package LP1Classes;

public class Iphone {
    private  int versao;
    private String cor;
    private int memoria;

    public Iphone(int versao, String cor, int memoria) {
        this.versao = versao;
        this.cor = cor;
        this.memoria = memoria;
    }

    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void Fotografar(){
        System.out.println("Foto tirada");
    }

    public void ouvirMusic(){
        System.out.println("Tocando música");
    }

    public void telefonar(){
        System.out.println("Telefonar");
    }
}
