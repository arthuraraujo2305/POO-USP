public class Main {
    public static void main(String[] args) {
        Aprovador s1 = new Supervisor();
        Aprovador s2 = new Gerente();
        Aprovador s3 = new Diretor();
        s1.setProximo(s2);
        s2.setProximo(s3);
        s3.setProximo(null);

        SolicitacaoCompra compra1 = new SolicitacaoCompra(800, "Materiais de limpeza");
        SolicitacaoCompra compra2 = new SolicitacaoCompra(15000, "Servidor novo");

        s1.aprovar(compra1); // Aprovado pelo Supervisor
        s1.aprovar(compra2); // Encaminhado para Diretor


    }
}