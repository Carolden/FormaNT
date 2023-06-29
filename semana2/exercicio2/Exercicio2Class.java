package ntforma.semana2.exercicio2;


//2 - Implemente a cifra de César para criptografar e descriptografar uma mensagem.
//        A aplicação deve:
//        FAZER COM SCANNER, DOIS MÉTODOS, CRIPTOGRAFAR E DESCRIPTOGRAFAR --- USAR ARRAY
//
//        COLETAR DADOS:
//        • Receber um texto
//        • Receber um número --- QUANTAS VEZES VAI ROTACIONAR, EX: SE FOR 2, VAI COMEÇAR NO C
//        OFERECER OPÇÕES:
//        1 - para criptografar
//        2- para descriptografar
//        REALIZAR A AÇÃO SELECIONADA E IMPRIMIR O RESULTADO NA TELA:


public class Exercicio2Class {

    public String codificar(String mensagem, int voltas) {
        StringBuilder mensagemCodificada = new StringBuilder();
        for (int i = 0; i < mensagem.length(); i++) {
            char caracter = mensagem.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
                char cifrado = (char) ((caracter - base + voltas) % 26 + base);
                mensagemCodificada.append(cifrado);
            } else {
                mensagemCodificada.append(caracter);
            }
        }

        return mensagemCodificada.toString();
    }


    public String decodificar(String mensagemCifrada, int chave) {
        return codificar(mensagemCifrada, 26 - chave);
    }
}

