package ntforma.semana2.exercicio2;


import java.util.Scanner;

public class Exercicio2Start {
    public static void main(String[] args) {
        Exercicio2Class start = new Exercicio2Class();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a palavra que será codificada:  ");
        String palavra = teclado.nextLine();
        System.out.println("Digite a chave da codificação:  ");
        int cifra = teclado.nextInt();
        String mensagemCodificada = start.codificar(palavra, cifra);
        System.out.println("Mensagem codificada: " + mensagemCodificada);


        String mensagemDecodificada = start.decodificar(mensagemCodificada, cifra);
        System.out.println("Mensagem codificada: " + mensagemDecodificada);
    }
}
