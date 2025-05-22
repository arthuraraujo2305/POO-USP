public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoinicial){
        this.titular = titular;
        this.saldo = saldoinicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo Insuficiente. Tentativa de saque: R$" + valor);

        }
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }
}
