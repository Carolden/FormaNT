package ntforma.exercicio1;


//1 -  Imprima todos números pares de 0 a 100


public class Exercicio1Class {
    public void imprimePares() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
