package Theoretical_content;


public class Celular { //classe sempre terá o mesmo nome do arquivo 

    String nome;
    String sistemaOperacional;
    int espacoArmazenamento;
    float tamanhoTela;

    void mensagemDeEntrada(){
        System.out.format("Hello %s%n", nome);
    }

    void avisoCarregarCelular(String statusbateria){
        if(statusbateria == "100%"){
            System.out.format("A bateria do celular está completamente carregada%n");
        }  else {

             System.out.format("Carregar o celular%n");

        }
    }
}


