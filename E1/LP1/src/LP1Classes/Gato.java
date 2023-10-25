package LP1Classes;

public class Gato {
    private String nome;
    private String cor;
    private String raca;

    public Gato(String nome, String cor, String raca){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }
    public void miar(){
        System.out.println("Miau");
    }

    public void brincar(){
        System.out.println("Brincando");
    }

    public void dormir(){
        System.out.println("Dormindo");
    }
}
