package Theoretical_content;

public class App{

    public static void main(String[] arg) throws Exception {
        
        // Sempre que eu criar uma variável do tipo Classe, 
        // estou criando um objeto

        //declarando o objeto = instanciando o objeto
        Celular celularA = new Celular();
        
        celularA.nome = "Iphone12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        // O '.format' é usado para que eu posso exibir strings na tela com dados que são de 
        // outro tipo, para isso temos que usar os placeholders para cada tipo de dado;
        // %s: para string
        // %f: para float, e podemos dizer quantas casas decimais queremos
        //     exemplo: .2%f seria para duas casas decimais após a virgula
        // %b: para boolean
        // %d: para inteiros
        // %n: usa-se para adicionar uma quebra de linha
         System.out.format("Celular %s com tela de %.1f, com %dgb SO %s%n", 
        celularA.nome, celularA.tamanhoTela,celularA.espacoArmazenamento, celularA.sistemaOperacional);

        celularA.mensagemDeEntrada();
        celularA.avisoCarregarCelular("10%");
    }

}