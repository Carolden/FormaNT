package ntforma.semana2.exercicio3;

public class Exercicio3Class {

    private String palavraChave;

    public Exercicio3Class(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String criptografar(String mensagem) {
        StringBuilder mensagemCriptografada = new StringBuilder();
        int tamanhoPalavraChave = palavraChave.length();
        int tamanhoMensagem = mensagem.length();

        for (int i = 0; i < tamanhoMensagem; i++) {
            char caractereAtual = mensagem.charAt(i);
            char caractereChave = palavraChave.charAt(i % tamanhoPalavraChave);

            if (Character.isLetter(caractereAtual)) {
                boolean isUpperCase = Character.isUpperCase(caractereAtual);
                int offsetBase = isUpperCase ? 'A' : 'a';
                int indexCaractereAtual = (caractereAtual - offsetBase);
                int indexCaractereChave = (caractereChave - 'a');
                int caractereCriptografado = (indexCaractereAtual + indexCaractereChave) % 26 + offsetBase;
                mensagemCriptografada.append((char) caractereCriptografado);
            } else {
                mensagemCriptografada.append(caractereAtual);
            }
        }

        return mensagemCriptografada.toString();
    }

    public String descriptografar(String mensagemCriptografada) {
        StringBuilder mensagemDescriptografada = new StringBuilder();
        int tamanhoPalavraChave = palavraChave.length();
        int tamanhoMensagemCriptografada = mensagemCriptografada.length();

        for (int i = 0; i < tamanhoMensagemCriptografada; i++) {
            char caractereAtual = mensagemCriptografada.charAt(i);
            char caractereChave = palavraChave.charAt(i % tamanhoPalavraChave);

            if (Character.isLetter(caractereAtual)) {
                boolean isUpperCase = Character.isUpperCase(caractereAtual);
                int offsetBase = isUpperCase ? 'A' : 'a';
                int indexCaractereAtual = (caractereAtual - offsetBase);
                int indexCaractereChave = (caractereChave - 'a');
                int caractereDescriptografado = (indexCaractereAtual - indexCaractereChave + 26) % 26 + offsetBase;
                mensagemDescriptografada.append((char) caractereDescriptografado);
            } else {
                mensagemDescriptografada.append(caractereAtual);
            }
        }

        return mensagemDescriptografada.toString();
    }
}