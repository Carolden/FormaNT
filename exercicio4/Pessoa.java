package ntforma.exercicio4;


//4 -  Uma pessoa possui { nome cpf, rg, idade}
//        Um funcionário, alem de possuir as mesmas informações de uma pessoa, possui também { cargo, salário}
//        Um Motorista, alem de possuir as mesmas informações de um funcionário, possui também { cnh, placaCarro}
//        Monte a estrutura de classes, instancie 2 Motoristas e imprima no console { nome, cargo e placaCarro } de cada motorista

public class Pessoa {
   private String nome;
    private String cpf;
    private String rg;

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private int idade;

    public Pessoa(String nome, String cpf, String rg, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

}
