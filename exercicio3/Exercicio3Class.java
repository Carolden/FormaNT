package ntforma.exercicio3;


//3 -  Crie um método que receba como parâmetro  um texto do tipo String e retorne se este texto é palindromo.


public class Exercicio3Class {
    public static boolean validaPalindromo(String palavra) {
        int tamanho = palavra.length();
        String palavraNova = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            palavraNova += palavra.charAt(i);
        }

        if (palavra.equals(palavraNova)) {
            return true;
        } else {
            return false;
        }
    }


}

