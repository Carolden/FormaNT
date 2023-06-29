package ntforma.semana2.exercicio3;

import java.util.Scanner;

public class Exercicio3Start {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a chave para codificação: ");
        String palavraChave = teclado.nextLine();
        System.out.print("Digite a mensagem que será codificada: ");
        String mensagem = teclado.nextLine();

        Exercicio3Class cifra = new Exercicio3Class(palavraChave);

        // Criptografar a mensagem
        String mensagemCriptografada = cifra.criptografar(mensagem);
        System.out.println("Mensagem criptografada: " + mensagemCriptografada);

        // Descriptografar a mensagem
        String mensagemDescriptografada = cifra.descriptografar(mensagemCriptografada);
        System.out.println("Mensagem descriptografada: " + mensagemDescriptografada);
    }
}

