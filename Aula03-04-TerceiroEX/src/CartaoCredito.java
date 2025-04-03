public class CartaoCredito implements MetodoPagamento{
    private String numeroCartao;
    private double limiteDisponivel;
    private static final double TAXA = 0.05;
    public CartaoCredito(String numeroCartao, double limiteDisponivel) {
        this.numeroCartao = numeroCartao;
        this.limiteDisponivel = limiteDisponivel;
    }
    @Override
    public void realizarPagamento(double valor) {
        if (valor <= limiteDisponivel) {
            limiteDisponivel -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso no cartão de crédito.");
        } else {
            System.out.println("Limite do cartão de crédito insuficiente.");
        }
    }
    @Override
    public double getTaxaPagamento() {
        return TAXA;
    }

}
