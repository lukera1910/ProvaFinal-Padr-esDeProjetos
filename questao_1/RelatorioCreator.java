public abstract class RelatorioCreator {
    public void processar() {
        Relatorio r = criarRelatorio();
        r.preparar();
        r.gerar();
    }

    protected abstract Relatorio criarRelatorio();
}