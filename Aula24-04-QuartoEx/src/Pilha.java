public class Pilha <T>{
    Object[] pilha;
    int capacidade;
    int topo;
    Pilha(int i){
        capacidade = 10;
        pilha = new Object[capacidade];
        topo = -1;
    }

    public boolean empilhar(T elemento){
        if(topo == capacidade - 1){
            return false;
        }
        topo++;
        pilha[topo] = elemento;
        return true;
    }

    public T desempilha(){
        if(topo == -1){
            return null;
        }
        T elemento = (T) pilha[topo];
        topo--;
        return elemento;
    }

    public int tamanho() {
        return topo + 1;
    }
}
