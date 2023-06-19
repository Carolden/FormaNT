package ntforma.exercicio6;


//6 - Crie um método que receba o custo e o pagamento, ele deve imprimir no console as seguintes informações:
//        Valor do troco
//        Troco em menor quantidade de notas e moedas possiveis
//        exemplo:
//        custo:
//        R$ 17,35
//        pagamento:
//        R$ 20,00
//        troco:
//        R$ 2,65
//        menor troco:
//        1 - nota de 2
//        1 - moeda de 50
//        1 - moeda de 10
//        1 - moeda de 5

public class Exercicio6Class {
    public void troco(double custo, double pagamento) {

        double valores[] = { 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05 };
        double menoresValores[] = new double[24];
        int indiceMenor = 0;


        System.out.printf("Custo: %.2f\n " , custo);
        System.out.printf("Pagamento: %.2f\n " , pagamento);

        double troco = pagamento - custo;

        System.out.printf("Troco: %.2f\n " , troco);

        for (int i = 0; i < valores.length; i++) {
            int quantidade = (int) (troco / valores[i]);

            if (quantidade > 0) {
                troco -= valores[i] * quantidade;
                menoresValores[indiceMenor] = valores[i];
                menoresValores[indiceMenor + 1] = quantidade;
                indiceMenor = indiceMenor + 2;
            }
        }

        System.out.println("Menor troco");
        for (int i = 0; i < menoresValores.length; i = i + 2) {
            if (menoresValores[i] > 0) {
                System.out.println("Valor(es): R$ " + menoresValores[i] + " - Quantidade de notas ou centavos: " + menoresValores[i + 1]);
            }
        }

    }
}
