public class Planilha extends Documento{
    private int nCelulas;
    public Planilha(String titulo, String autor, int tamanhoKB, int nCelulas) {
        super(titulo, autor, tamanhoKB);
        this.nCelulas = nCelulas;
    }
    public void processaCels() {
        System.out.printf("Processando %d células...\n", nCelulas);
        System.out.println("Células processadas com sucesso!");
    }
    @Override
    public boolean abrir() {
        System.out.printf("Abrindo planilha '%s' com %d células...\n",
                getTitulo(), nCelulas);
        System.out.println("Mostrando conteúdo da planilha...");
        return true;
    }
    @Override
    public void formatar() {
        System.out.printf("Formatando planilha '%s'...\n", getTitulo());
        System.out.println("Planilha formatada com sucesso!");
    }
}
