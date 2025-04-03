import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<MetodoPagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito("1234-5678-9876-5432", 1000));
        pagamentos.add(new Pix("usuario@pix.com"));
        pagamentos.add(new BoletoBancario("23793", "2025-04-10"));

        double valorCompra = 300;
        double totalTaxas = 0;

        for (MetodoPagamento metodo : pagamentos) {
            System.out.println("\nProcessando pagamento com: " + metodo);
            metodo.realizarPagamento(valorCompra);
            totalTaxas += valorCompra * metodo.getTaxaPagamento();
        }

        System.out.printf("\nCusto total com taxas: R$ %.2f%n", totalTaxas);
    }
}