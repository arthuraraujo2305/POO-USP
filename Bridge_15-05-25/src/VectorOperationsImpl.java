public class VectorOperationsImpl implements  VectorOperations{
    @Override
    public double[] adicionar(double[] vetor1, double[] vetor2){
        if (vetor1.length != 3 || vetor2.length != 3){
            throw new IllegalArgumentException("Vetores devem ter dimensão 3");
        }
        return new double[]{
                vetor1[0] + vetor2[0],
                vetor1[1] + vetor2[1],
                vetor1[2] + vetor2[2]
        };
    }
    @Override
    public double[] produtoVetorial(double[] vetor1, double[] vetor2){
        if (vetor1.length != 3 || vetor2.length != 3){
            throw new IllegalArgumentException("Vetores devem ter dimensão 3");
        }
        return new double[]{
                vetor1[1] * vetor2[2] - vetor1[2] * vetor2[1],
                vetor1[2] * vetor2[0] - vetor1[0] * vetor2[2],
                vetor1[0] * vetor2[1] - vetor1[1] * vetor2[0]
        };
    }
    @Override
    public double produtoEscalar(double[] vetor1, double[] vetor2) {
        if (vetor1.length != 3 || vetor2.length != 3) {
            throw new IllegalArgumentException("Vetores devem ter dimensão 3");
        }
        return vetor1[0] * vetor2[0] + vetor1[1] * vetor2[1] + vetor1[2] * vetor2[2];
    }
    @Override
    public void exibirResultado(String operacao, double[] vetor1, double[] vetor2, Object resultado){
        System.out.println("Operação: " + operacao);
        System.out.println("Vetor 1: [" + vetor1[0] + ", " + vetor1[1] + ", " + vetor1[2] + "]");
        System.out.println("Vetor 2: [" + vetor2[0] + ", " + vetor2[1] + ", " + vetor2[2] + "]");

        if (resultado instanceof double[]) {
            double[] vetorResultado = (double[]) resultado;
            System.out.println("Resultado: [" + vetorResultado[0] + ", " + vetorResultado[1] + ", " + vetorResultado[2] + "]");
        } else {
            System.out.println("Resultado: " + resultado);
        }
        System.out.println();
    }
}