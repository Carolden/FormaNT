package ntforma.semana2.exercicio1;

import java.util.Scanner;

import static ntforma.semana2.exercicio1.Exercicio1Class.calculaFatorial;

public class Exercicio1Start {
    public static void main(String[] args) {
        Exercicio1Class start = new Exercicio1Class();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número que será calculado: ");
        int numero = teclado.nextInt();
        int resultado = calculaFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
