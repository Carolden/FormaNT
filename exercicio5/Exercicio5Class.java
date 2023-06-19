package ntforma.exercicio5;

//5 -  Crie um método que receba um número inteiro e gere uma matriz identidade a partir deste número    Exemplo:
//        Número:
//        3
//        Matriz:
//        1    0    0
//        0    1    0
//        0    0    1

public class Exercicio5Class {
    public void geraMatrizIdentidade(int numero) {
        
        int matriz[][] = new int[numero][numero];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
