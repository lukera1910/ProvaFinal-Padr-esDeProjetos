public class RelatorioEmergencialCreator extends RelatorioCreator {
    protected Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}