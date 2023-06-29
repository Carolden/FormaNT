package ntforma.semana2.exercicio4;

import java.util.Scanner;

public class Exercicio4Start {
    public static void main(String[] args) {
        UsuarioBase usuarioBase = new UsuarioBase();
        UsuarioStandard usuarioStandard = new UsuarioStandard();
        UsuarioPremium usuarioPremium = new UsuarioPremium();


        System.out.println("----------------------USUÁRIO BASE----------------------");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do produto do usuário base: ");
        double valorUsuarioBase = teclado.nextDouble();
        System.out.print("Digite o valor do frete do usuário base: ");
        double valorFreteUsuarioBase = teclado.nextDouble();


        usuarioBase.getValorDesconto(valorUsuarioBase);
        usuarioBase.getTipoUsuario();
        System.out.println(usuarioBase.getValorFreteDesconto(valorFreteUsuarioBase, valorUsuarioBase));

        System.out.println("----------------------USUÁRIO STANDARD----------------------");

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Digite o valor do produto do usuário base: ");
        double valorUsuarioStandard = teclado2.nextDouble();
        System.out.print("Digite o valor do frete do usuário base: ");
        double valorFreteUsuarioStandard = teclado2.nextDouble();


        usuarioStandard.getValorDesconto(valorUsuarioStandard);
        usuarioStandard.getTipoUsuario();
        System.out.println(usuarioStandard.getValorFreteDesconto(valorFreteUsuarioStandard, valorUsuarioStandard));

        System.out.println("----------------------USUÁRIO PREMIUM----------------------");

        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Digite o valor do produto do usuário base: ");
        double valorUsuarioPremium = teclado3.nextDouble();
        System.out.print("Digite o valor do frete do usuário base: ");
        double valorFreteUsuarioPremium = teclado3.nextDouble();


        usuarioPremium.getValorDesconto(valorUsuarioPremium);
        usuarioPremium.getTipoUsuario();
        System.out.println(usuarioPremium.getValorFreteDesconto(valorFreteUsuarioPremium, valorUsuarioPremium));
    }
}
