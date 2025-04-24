public class Main {
    public static void main(String[] args) {
        Pilha<String> pilhaString = new Pilha<>(3);
        pilhaString.empilhar("A");
        pilhaString.empilhar("B");
        pilhaString.empilhar("C");
        //teste desempilhar
        System.out.println("Desempilhando: " + pilhaString.desempilha());
        //teste tamanho
        System.out.println("Tamanho da pilha: " + pilhaString.tamanho());
    }
}