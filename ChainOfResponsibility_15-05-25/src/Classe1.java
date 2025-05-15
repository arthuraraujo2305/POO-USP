public class Classe1 extends ClasseOperadora{
    public Classe1(ClasseOperadora prox){
        super(prox);
    }
    @Override
    public boolean aptoAProcessar(int umNumero){
        return umNumero %2 == 0;
    }

    @Override
    public void calcular(int umNumero){
        System.out.println("Classe 1: ");
        System.out.println(Math.pow(umNumero, 2));
        System.out.println(Math.pow(umNumero, 0.5));
    }
}
