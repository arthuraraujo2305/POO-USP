public abstract class Documento {
    protected String titulo;
    protected String autor;
    protected int tamanhoKB;

    public Documento(String nome, String titulo, int tamanhoKB) {
        this.titulo = nome;
        this.autor = titulo;
        this.tamanhoKB = tamanhoKB;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getTamanhoKB() {
        return tamanhoKB;
    }
    public String toString(){
        return titulo;
    }
    public abstract boolean abrir();
    public abstract void formatar();
}
