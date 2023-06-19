package ntforma.exercicio2;


//2 -  Imprima todos os números primos de 0 a 1000.


public class Exercicio2Class {

    public boolean testaPrimo(int numero) {
        int divisor = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisor++;
            }
        }
        if (divisor == 2) {
            return true;
        } else {
            return false;
        }
    }
}
