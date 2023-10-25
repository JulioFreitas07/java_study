package LP1Classes;

import java.sql.SQLOutput;

public class Televisao {
    private String marca;
    private  int tamanho;

    private int volume;

    private boolean liga;

    public Televisao(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.volume = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void ligar(){
        this.liga = true;
        System.out.println("Tv ligada");
    }

    public void desligar(){
        if (this.liga == true){
            System.out.println("Desligando");

        }else{
            System.out.println("Tv já se encontra desligadad");
        }
    }

    public void aumentarVolume(){
        if(this.volume > 32){
            System.out.println("Volume Máximo");
            this.volume = 32;
        }
        this.volume++;
        System.out.println("Aumentando volume");
    }

    public void diminuirVolume(){

        if (this.volume == 0){
            System.out.println("Volume mínimo");
            this.volume = 0;
        }
        this.volume--;
        System.out.println("Diminuindo volume");
    }


}
