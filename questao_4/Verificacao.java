package questao_4;

public abstract class Verificacao {
    private Verificacao proxima;

    public Verificacao definirProxima(Verificacao proxima) {
        this.proxima = proxima;
        return proxima;
    }

    public boolean verificar(Transacao t) {
        if (!executar(t)) return false;
        if (proxima == null) return true;
        return proxima.verificar(t);
    }

    protected abstract boolean executar(Transacao t);
}
