public class Estoque {
    private Produto[] produtos;
    public Estoque(){
        produtos = new Produto[100];
    }
    public boolean adicionarProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                return true;
            }
        }
        return false;
    }
    public boolean removerProdutoPorId(int id) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getId() == id) {
                produtos[i] = null;
                return true;
            }
        }
        return false;
    }
    public Produto buscarProdutoPorNome(String nome) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getNome().equals(nome)) {
                return produtos[i];
            }
        }
        return null;
    }
    public String toString(){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println(produtos[i].toString());
            }
        }
        return null;
    }
}
