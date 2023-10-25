package LP1Classes;

public class Cachorro {
    private String nome;
    private String cor;
    private String raca;

    public Cachorro(String nome, String cor, String raca){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;

    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    public void latir(){
        System.out.println("au au");
    }

    public void sentar(){
        System.out.println("Sentado");
    }

    public void morder(){
        System.out.println("Mordeu");
    }
}
