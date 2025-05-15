public class MeuVetor extends Vector {
    public MeuVetor(VectorOperations operations, double[] valores) {
        super((VectorOperations) operations, valores);
    }

    @Override
    public void adicionar(Vector outro) {
        double[] resultado = operations.adicionar(this.valores, outro.valores);
        operations.exibirResultado("Adição", this.valores, outro.valores, resultado);
    }

    @Override
    public void produtoEscalar(Vector outro) {
        double resultado = operations.produtoEscalar(this.valores, outro.valores);
        operations.exibirResultado("Produto Escalar", this.valores, outro.valores, resultado);
    }

    @Override
    public void produtoVetorial(Vector outro) {
        double[] resultado = operations.produtoVetorial(this.valores, outro.valores);
        operations.exibirResultado("Produto Vetorial", this.valores, outro.valores, resultado);
    }
}