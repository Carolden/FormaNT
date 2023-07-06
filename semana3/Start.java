package ntforma.semana3;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Filme filme = new Filme();
        Usuario usuario = new Usuario();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------MENU----------------------");
            System.out.println("" +
                    "[1] ENTRAR \n" +
                    "[2] CADASTRAR \n" +
                    "[3] SAIR");
            int opcao = teclado.nextInt();
            if (opcao == 1) {
                System.out.println("Você é cliente ou funcionário? \n" +
                        "[1] CLIENTE \n" +
                        "[2] FUNCIONÁRIO");
                int role = teclado.nextInt();
                if (role == 1) {
                    System.out.println("Digite o nome de usuário: ");
                    String user = teclado.next();
                    System.out.println("Digite a senha do usuário");
                    String senha = teclado.next();
                    usuario.confereNomeCliente(user);

                    if (usuario.confereNomeCliente(user)) {
                        System.out.println("Usuário autenticado.");
                    } else {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }

                    if (usuario.confereSenhaCliente(senha)) {
                        System.out.println("Senha autenticada.");
                    } else {
                        System.out.println("Senha incorreta.");
                        break;
                    }
                    while (true) {
                        System.out.println("Bem vindo cliente. Selecione uma das opções abaixo.");
                        System.out.println("" +
                                "[1] COMPRAR INGRESSO \n" +
                                "[2] LISTAR FILMES EM CARTAZ \n" +
                                "[3] VISUALIZAR INGRESSOS QUE COMPROU \n" +
                                "[4] SAIR");

                        int opcaoCliente = teclado.nextInt();

                        if (opcaoCliente == 1) {
                            int idade = usuario.getIdade();
                            usuario.compraIngresso(idade);
                        } else if (opcaoCliente == 2) {
                            filme.imprimeListaDeFilmes();
                        } else if (opcaoCliente == 3) {
                            for (int i = 0; i < usuario.filmesComprados.size(); i++) {
                                System.out.println(usuario.filmesComprados.get(i).getTitulo());
                            }
                        } else if (opcaoCliente == 4) {
                            break;
                        }
                    }
                } else if (role == 2) {
                    System.out.println("Digite o nome de usuário: ");
                    String user = teclado.next();
                    System.out.println("Digite a senha do usuário");
                    String senha = teclado.next();
                    if (usuario.confereNomeFuncionario(user)) {
                        System.out.println("Usuário autenticado.");
                    } else {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }
                    if (usuario.confereSenhaFuncionario(senha)) {
                        System.out.println("Senha autenticada.");
                    } else {
                        System.out.println("Senha incorreta.");
                        break;
                    }
                    while (true) {
                        System.out.println("Bem vindo funcionário. Selecione uma das opções abaixo: ");
                        System.out.println("" +
                                "[1] CADASTRAR FILME \n" +
                                "[2] EXCLUIR FILME \n" +
                                "[3] LISTAR FILMES EM CARTAZ \n" +
                                "[4] SAIR");

                        int opcaoFuncionario = teclado.nextInt();
                        if (opcaoFuncionario == 1) {
                            filme.cadastraFilme();
                        } else if (opcaoFuncionario == 2) {
                            filme.excluiFilme();
                        } else if (opcaoFuncionario == 3) {
                            filme.imprimeListaDeFilmes();
                        } else if (opcaoFuncionario == 4) {
                            break;
                        }
                    }
                }
            } else if (opcao == 2) {
                usuario.cadastraUsuario();
            } else if (opcao == 3) {
                System.exit(0);
            }


        }


    }
}
