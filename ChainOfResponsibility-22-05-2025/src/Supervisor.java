public class Supervisor extends Aprovador{
    @Override
    public void aprovar(SolicitacaoCompra s){
        if (s.getValor() <= 1000){
            System.out.println("Supervisor apovou: " + s.getDescricao());
        } else if (proximo != null) {
            proximo.aprovar(s);
            
        }
    }
}
