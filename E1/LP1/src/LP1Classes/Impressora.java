package LP1Classes;

public class Impressora {
    private String nome;
    private String marca;
    private int ano;
    private boolean on;

    public Impressora(String nome, String marca, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.on = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar(){
        this.on = true;
        System.out.println("Ligado");

    }

    public void imprimir(){
        if(this.on){
            System.out.println("Imprimindo");
        }else {
            System.out.println("Ligue a impressora");
        }
    }

    public void desligar(){
        if(this.on){
            System.out.println("Desligando");
            this.on = false;
        }else {
            System.out.println("Impressora já se encontra desligada");
        }
    }
}
