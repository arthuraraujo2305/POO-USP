public class BoletoBancario implements MetodoPagamento{
    private String codigoBarras;
    private String dataVencimento;
    private static final double TAXA = 0.02;
    public BoletoBancario(String codigoBarras, String dataVencimento) {
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso via Boleto Bancário.");
    }
    @Override
    public double getTaxaPagamento() {
        return TAXA;
    }
}
