package ntforma.semana2.exercicio1;


//1 - Implemente um método que receba um número e imprima o resultado do fatorial deste número.


public class Exercicio1Class {
    public static int calculaFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calculaFatorial(numero - 1);
        }
    }
}
