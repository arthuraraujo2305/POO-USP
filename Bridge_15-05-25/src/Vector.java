public abstract class Vector {
    protected VectorOperations operations;
    protected double[] valores;

    public Vector(VectorOperations operations, double[] valores) {
        this.operations = operations;
        this.valores = valores;
    }

    public abstract void adicionar(Vector outro);
    public abstract void produtoEscalar(Vector outro);
    public abstract void produtoVetorial(Vector outro);
}
