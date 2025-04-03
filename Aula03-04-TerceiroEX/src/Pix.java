public class Pix implements MetodoPagamento{
    private String chavePix;
    private static final double TAXA = 0.00;
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com sucesso via Pix.");
    }
    @Override
    public double getTaxaPagamento() {
        return TAXA;
    }
}
