public class Texto extends Documento{
    private int nPalavras;
    public Texto(String titulo, String autor, int tamanhoKB, int nPalavras) {
        super(titulo, autor, tamanhoKB);
        this.nPalavras = nPalavras;
    }
    public int contarPalavras() {
        return nPalavras;
    }
    @Override
    public boolean abrir() {
        System.out.printf("Abrindo documento de texto '%s' com %d palavras...\n",
                getTitulo(), nPalavras);
        System.out.println("Mostrando conteúdo do texto...");
        return true;
    }
    @Override
    public void formatar() {
        System.out.printf("Formatando documento de texto '%s'...\n", getTitulo());
        System.out.println("Texto formatado com sucesso!");
    }
}
