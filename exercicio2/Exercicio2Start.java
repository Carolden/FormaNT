package ntforma.exercicio2;

public class Exercicio2Start {
    public static void main(String[] args) {
        Exercicio2Class start = new Exercicio2Class();

        for (int i = 0; i <= 1000; i++) {
            if (start.testaPrimo(i)) {
                System.out.println(i);
            }
        }

    }
}
