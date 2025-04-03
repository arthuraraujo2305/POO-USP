public class Produto {
    private String nome;
    private int id;
    private double preco;
    private int quantidade;
    Produto (int id, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void vender (int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
    public void repor (int quantidadeReposta) {
        quantidade += quantidadeReposta;
    }
    public String toString() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        return null;
    }
}
