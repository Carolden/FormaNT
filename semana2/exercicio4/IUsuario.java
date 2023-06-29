package ntforma.semana2.exercicio4;


//METODOS DA INTERFACE+ Double getValorDesconto(double valorProduto)+ String getTipoUsuario()+ String getValorFreteDesconto(double valorValorFrete, double valorProduto)
//        Agora crie 3 classes que implemente esta interface ---- POR SER UMA INTERFACE, PRECISA TER MÉTODOS IMPLEMENTADOS NAS CLASSES


public interface IUsuario {
    double getValorDesconto(double valorProduto);

    String getTipoUsuario();

    String getValorFreteDesconto(double valorValorFrete, double valorProduto);

}
