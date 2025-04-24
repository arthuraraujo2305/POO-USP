public class Futebol implements Comparable<Futebol> {
    private String nome;
    private int ponuacao;
    private int capacidadeEstadio;

    public Futebol(String nome, int ponuacao, int capacidadeEstadio) {
        this.nome = nome;
        this.ponuacao = ponuacao;
        this.capacidadeEstadio = capacidadeEstadio;
    }

    public int compareTo(Futebol outroTime) {
        if (this.capacidadeEstadio > outroTime.capacidadeEstadio) {
            return 1;
        } else if (this.capacidadeEstadio < outroTime.capacidadeEstadio) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return nome + " - Pontuação: " + ponuacao + ", Capacidade Estádio: " + capacidadeEstadio;
    }
}
