import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //teste calculadora de media
        ArrayList<DoubleComputavel> lista = new ArrayList<>();
        lista.add(new DoubleComputavel() {
            @Override
            public double doubleValue() {
                return 10.0;
            }
        });
        lista.add(new DoubleComputavel() {
            @Override
            public double doubleValue() {
                return 20.0;
            }
        });
        lista.add(new DoubleComputavel() {
            @Override
            public double doubleValue() {
                return 30.0;
            }
        });
        Calculadora calculadora = new Calculadora();
        double media = calculadora.media(lista);
        System.out.println("A média é: " + media);
    }
}