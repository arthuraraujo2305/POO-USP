public abstract class ClasseOperadora {
    private ClasseOperadora proximo;
    String sNome;
    public ClasseOperadora (ClasseOperadora umProx){
        proximo = umProx;
    }
    public void percorreLista(){
        if (this.proximo != null)
            this.proximo.percorreLista();
        System.out.println("Elemento da lista: " + this);

    }
    public void processsa(int umNumero){
        if (this.aptoAProcessar(umNumero))
            this.calcular(umNumero);
        else if(this.proximo != null)
            this.proximo.processsa(umNumero);
        System.out.println("Elemento da lista: " + this);

    }
    abstract public boolean aptoAProcessar(int umNumero);
    abstract public void calcular(int umNumero);

}
