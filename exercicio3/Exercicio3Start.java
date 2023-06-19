package ntforma.exercicio3;

public class Exercicio3Start {
    public static void main(String[] args) {
        if (Exercicio3Class.validaPalindromo("sopapos")) {
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }

        if (Exercicio3Class.validaPalindromo("Carlos")) {
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }
    }
}
