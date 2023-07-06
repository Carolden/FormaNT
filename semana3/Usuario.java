package ntforma.semana3;


import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private String role;
    private int idade;
    private String user;
    private String password;


    Filme filme = new Filme();
    ArrayList<Filme> filmesComprados = new ArrayList();
    ArrayList<Usuario> listaFuncionarios = new ArrayList();
    ArrayList<Usuario> listaClientes = new ArrayList();
    Scanner teclado = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return new String(Base64.getDecoder().decode(this.password.getBytes()));
    } // PARA VALIDAR, CRIAR MÉTODO VALIDA COM .EQUALS GETPASSWORD

    public void setPassword(String password) {
        this.password = new String(Base64.getEncoder().encode(password.getBytes()));
    }

    public void validaPassword(String password) {

    }

    public void cadastraUsuario() {
        Usuario usuario = new Usuario();
        System.out.println("Digite o nome do usuário: ");
        usuario.setNome(teclado.next());

        System.out.println("Digite o tipo do usuário: 'C' para Cliente ou 'F' para Funcionário ");
        usuario.setRole(teclado.next());
        while (!usuario.getRole().equalsIgnoreCase("C") && !usuario.getRole().equalsIgnoreCase("F")) {
            System.out.println("Opção incorreta, digite o tipo do usuário (Cliente ou Funcionário): ");
            usuario.setRole(teclado.next());
        }
        System.out.println("Digite a idade do usuário: ");
        usuario.setIdade(teclado.nextInt());
        System.out.println("Digite o nome para login: ");
        usuario.setUser(teclado.next());
        System.out.println("Digite a senha: ");
        usuario.setPassword(teclado.next());
        if (usuario.getRole().equalsIgnoreCase("C")) {
            listaClientes.add(usuario);
            System.out.println("Cliente cadastrado.");
        } else {
            listaFuncionarios.add(usuario);
            System.out.println("Funcionário cadastrado.");
        }
    }

    public boolean confereNomeCliente(String user) {
        for (Usuario cliente : listaClientes) {
            if (cliente.getUser().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean confereSenhaCliente(String senha) {
        for (Usuario cliente : listaClientes) {
            if (senha.equals(cliente.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public boolean confereNomeFuncionario(String user) {
        for (Usuario funcionario : listaFuncionarios) {
            if (funcionario.getUser().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean confereSenhaFuncionario(String senha) {
        for (Usuario funcionario : listaFuncionarios) {
            if (senha.equals(funcionario.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void compraIngresso(int idade) {
        filme.imprimeListaDeFilmes();
        System.out.println("Selecione o id de um dos filmes acima para efetuar a compra: ");
        int opcao = teclado.nextInt();

        for (Filme filme : filme.listaFilmes) {
            if (filme.getId() == opcao) {
                if (filme.listaFilmes.get(opcao).getIdadeMinima() < idade) {
                    System.out.println("Você não possui a idade mínima para assistir este filme.");
                } else {
                    filmesComprados.add(filme.listaFilmes.get(opcao));
                    System.out.println("Compra finalizada com sucesso.");
                }
            }
        }
        System.out.println("Id não localizado.");
    }
}

