public class Gerente extends Aprovador{
    @Override
    public void aprovar(SolicitacaoCompra s) {
        if (s.getValor() <= 10000) {
            System.out.println("Gerente aprovou: " + s.getDescricao());
        } else if (proximo != null) {
            proximo.aprovar(s);
        }
    }
}
