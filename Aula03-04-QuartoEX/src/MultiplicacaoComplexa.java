public class MultiplicacaoComplexa implements  OperacaoComplexa {
    @Override
    public NumeroComplexo executar(NumeroComplexo n1, NumeroComplexo n2) {
        return n1.multiplicar(n2);
    }

    @Override
    public String toString() {
        return "Operacao de Multiplicacao Complexa";
    }
}
