public class Classe2 extends ClasseOperadora{
    public Classe2(ClasseOperadora prox){
        super(prox);
    }
    @Override
    public boolean aptoAProcessar(int umNumero){
        return umNumero %3 == 0;
    }

    @Override
    public void calcular(int umNumero){
        System.out.println("Classe 2: ");
        System.out.println(Math.pow(umNumero, 2));
        System.out.println(Math.pow(umNumero, 0.5));
    }
}
