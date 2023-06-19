package ntforma.exercicio4;


//4 -  Uma pessoa possui { nome cpf, rg, idade}
//        Um funcionário, alem de possuir as mesmas informações de uma pessoa, possui também { cargo, salário}
//        Um Motorista, alem de possuir as mesmas informações de um funcionário, possui também { cnh, placaCarro}
//        Monte a estrutura de classes, instancie 2 Motoristas e imprima no console { nome, cargo e placaCarro } de cada motorista

public class Motorista extends Funcionario {
    private String cnh;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    private String placaCarro;

    public Motorista(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        super(nome, cpf, rg, idade, cargo, salario);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
    }
}
