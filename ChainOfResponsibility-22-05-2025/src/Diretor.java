public class Diretor extends Aprovador{
    @Override
    public void aprovar(SolicitacaoCompra s) {
        System.out.println("Diretor aprovou: " + s.getDescricao());
    }
}
