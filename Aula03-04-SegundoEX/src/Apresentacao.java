public class Apresentacao extends Documento{
    private int nSlides;
    public Apresentacao(String titulo, String autor, int tamanhoKB, int nSlides) {
        super(titulo, autor, tamanhoKB);
        this.nSlides = nSlides;
    }
    public void apresentar() {
        System.out.printf("Apresentando %d slides...\n", nSlides);
        System.out.println("Apresentação concluída com sucesso!");
    }
    @Override
    public boolean abrir() {
        System.out.printf("Abrindo apresentação '%s' com %d slides...\n",
                getTitulo(), nSlides);
        System.out.println("Mostrando conteúdo da apresentação...");
        return true;
    }
    @Override
    public void formatar() {
        System.out.printf("Formatando apresentação '%s'...\n", getTitulo());
        System.out.println("Apresentação formatada com sucesso!");
    }
}
