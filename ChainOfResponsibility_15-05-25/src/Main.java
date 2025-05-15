public class Main {
    public static void main(String[] args) {
    ClasseOperadora chain1 = new Classe1(new Classe2(new Classe3(null)));
    chain1.processsa(16); //classe 1 deve fazer o calculo
    ClasseOperadora chain2 = new Classe3(new Classe1(new Classe2(new Classe3(null))));
    chain2.processsa(33);//Classe 2 deve fazer o calculo
    chain2.processsa(47);

    }
}