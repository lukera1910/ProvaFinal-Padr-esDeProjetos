package questao_4;

public class ValorSuspeito extends Verificacao {
    protected boolean executar(Transacao t) {
        return t.valor <= 5000;
    }
}
