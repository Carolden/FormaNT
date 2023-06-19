package ntforma.exercicio4;


//4 -  Uma pessoa possui { nome cpf, rg, idade}
//        Um funcionário, alem de possuir as mesmas informações de uma pessoa, possui também { cargo, salário}
//        Um Motorista, alem de possuir as mesmas informações de um funcionário, possui também { cnh, placaCarro}
//        Monte a estrutura de classes, instancie 2 Motoristas e imprima no console { nome, cargo e placaCarro } de cada motorista

public class Exercicio4Start {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Carlos","111.222.333-44","1234567890",26,"Motorista",2.500,"1234567890","XXX-1234");
        Motorista motorista2 = new Motorista("João","555.666.777-88","0987654321",40,"Motorista",2.500,"9876543210","XXX-4321");

        System.out.println("MOTORISTA 1");
        System.out.println("Nome: " + motorista1.getNome());
        System.out.println("Nome: " + motorista1.getCargo());
        System.out.println("Nome: " + motorista1.getPlacaCarro());
        System.out.println("MOTORISTA 2");
        System.out.println("Nome: " + motorista2.getNome());
        System.out.println("Nome: " + motorista2.getCargo());
        System.out.println("Nome: " + motorista2.getPlacaCarro());
    }
}
