public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("arthur", 500);
        try{
            conta1.sacar(800);
        } catch (SaldoInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}