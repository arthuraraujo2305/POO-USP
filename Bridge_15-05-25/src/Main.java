public class Main {
    public static void main(String[] args) {
        VectorOperations operations = new VectorOperationsImpl();

        // Criando vetores
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        Vector vetor1 = new MeuVetor(operations, v1);
        Vector vetor2 = new MeuVetor(operations, v2);

        // Realizando operações
        vetor1.adicionar(vetor2);
        vetor1.produtoEscalar(vetor2);
        vetor1.produtoVetorial(vetor2);
    }
}