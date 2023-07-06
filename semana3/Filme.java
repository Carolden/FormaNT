package ntforma.semana3;

import java.util.ArrayList;
import java.util.Scanner;

public class Filme {

    private int id = 0;
    private String titulo;
    private String genero;
    private int idadeMinima;
    private double tempo;
    private double valor;
    private String tecnologia;
    private int poltronasDisponiveis;

    ArrayList<Filme> listaFilmes = new ArrayList();

    Scanner teclado = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getPoltronasDisponiveis() {
        return poltronasDisponiveis;
    }

    public void setPoltronasDisponiveis(int poltronasDisponiveis) {
        this.poltronasDisponiveis = poltronasDisponiveis;
    }

    public void cadastraFilme() {
        Filme filme = new Filme();
        filme.setId(filme.getId());
        System.out.println("O id do filme é: " + this.id);
        filme.setId(this.id);
        this.id++;
        System.out.println("Digite o titulo do filme: ");
        filme.setTitulo(teclado.next());
        System.out.println("Digite o genero do filme: ");
        filme.setGenero(teclado.next());
        System.out.println("Digite a idade mínima do filme: ");
        filme.setIdadeMinima(teclado.nextInt());
        System.out.println("Digite a duração do filme: ");
        filme.setTempo(teclado.nextDouble());
        System.out.println("Digite o valor do filme: ");
        filme.setValor(teclado.nextDouble());
        System.out.println("Digite a tecnologia do filme (2D ou 3D): ");
        filme.setTecnologia(teclado.next());
        filme.setPoltronasDisponiveis(100);
        System.out.println("Quantidade de poltronas disponíveis: " + filme.getPoltronasDisponiveis());
        listaFilmes.add(filme);
        System.out.println("Filme cadastrado com sucesso.");
    }

    public boolean excluiFilme() {
        imprimeListaDeFilmes();
        System.out.println("Digite o id do filme que você gostaria de excluir: ");
        int numero = teclado.nextInt();
        if (listaFilmes.get(numero).getPoltronasDisponiveis() < 100) {
            System.out.println("Você não pode excluir este filme pois existem poltronas ocupadas.");
            return false;
        }
        listaFilmes.remove(numero);
        System.out.println("Filme excluido.");
        return true;
    }

    public void imprimeListaDeFilmes() {
        for (Filme filme : listaFilmes) {
            System.out.println("Nome do filme: " + filme.getTitulo());
            System.out.println("Id do filme: " + filme.getId());
            System.out.println("#####################################");
        }
    }
}
