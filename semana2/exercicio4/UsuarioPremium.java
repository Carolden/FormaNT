package ntforma.semana2.exercicio4;

public class UsuarioPremium implements IUsuario {

    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            valorProduto *= 0.70;
            System.out.println("O valor do produto reajustado com o desconto é: " + valorProduto);
            return valorProduto;
        } else {
            System.out.println("Você não recebeu nenhum desconto para o produto.");
            return valorProduto;
        }
    }

    @Override
    public String getTipoUsuario() {
        String tipo = "Usuário Premium";
        return tipo;
    }

    @Override
    public String getValorFreteDesconto(double valorValorFrete, double valorProduto) {
        if (valorProduto > 100) {
            valorValorFrete = 0;
            String desconto = ("Você ganhou frete grátis!");
            return desconto;
        } else {
            String desconto = ("Você não recebeu desconto para o frete.");
            return desconto;
        }
    }
}
