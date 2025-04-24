import java.util.ArrayList;
public class Calculadora {
    double media(ArrayList <? extends DoubleComputavel> a) {
        double soma = 0;
        for (DoubleComputavel d : a) {
            soma += d.doubleValue();
        }
        return (double) soma / a.size();
    }
}
