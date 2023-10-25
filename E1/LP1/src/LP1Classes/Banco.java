package LP1Classes;

public class Banco {
    private String nome;
    private String cpf;
    private double saldo;

    public Banco(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void depositar(double saldo){
        this.saldo = saldo;
        System.out.println("Depositado o valor"+ saldo);
    }

    public void saque(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
        }
        this.saldo = this.saldo - valor;
        System.out.println("Saque realizado com sucesso");
    }

    public void extrato(){
        System.out.println("--------------------");
        System.out.println("| Extrato = "+ this.saldo +"|");
        System.out.println("--------------------");
    }
}
