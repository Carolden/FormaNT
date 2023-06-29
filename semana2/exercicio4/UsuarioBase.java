package ntforma.semana2.exercicio4;

public class UsuarioBase implements IUsuario {
    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            valorProduto *= 0.95;
            System.out.println("O valor do produto reajustado com o desconto é: " + valorProduto);
            return valorProduto;
        } else {
            System.out.println("Você não recebeu nenhum desconto para o produto.");
            return valorProduto;
        }
    }

    @Override
    public String getTipoUsuario() {
        String tipo = "Usuário Base";
        return tipo;
    }

    @Override
    public String getValorFreteDesconto(double valorValorFrete, double valorProduto) {
        if (valorProduto > 300) {
            valorValorFrete *= 0.95;
            String desconto = ("O frete reajustado com o desconto é: " + valorValorFrete);
            return desconto;
        } else {
            String desconto = ("Você não recebeu desconto para o frete.");
            return desconto;
        }
    }
}
