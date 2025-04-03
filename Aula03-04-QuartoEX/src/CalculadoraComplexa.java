public class CalculadoraComplexa {
    private OperacaoComplexa operacao;

    public void setOperacao(OperacaoComplexa operacao) {
        this.operacao = operacao;
    }

    public NumeroComplexo calcular(NumeroComplexo a, NumeroComplexo b) {
        if (operacao == null) {
            throw new IllegalStateException("Nenhuma operação definida");
        }
        return operacao.executar(a, b);
    }
}