public class SomaComplexa implements  OperacaoComplexa {
    @Override
    public NumeroComplexo executar(NumeroComplexo n1, NumeroComplexo n2) {
        return n1.adicionar(n2);
    }
    @Override
    public String toString() {
        return "Operacao de Soma Complexa";
    }
}
