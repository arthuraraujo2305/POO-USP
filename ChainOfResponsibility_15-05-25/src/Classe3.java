public class Classe3 extends ClasseOperadora{
    public Classe3(ClasseOperadora prox){
        super(prox);
    }
    @Override
    public boolean aptoAProcessar(int umNumero){
        return umNumero %2 != 0 && umNumero %3 != 0;
    }

    @Override
    public void calcular(int umNumero){
        System.out.println("Classe 3: ");
        System.out.println(Math.pow(umNumero, 2));
        System.out.println(Math.pow(umNumero, 0.5));
    }
}
