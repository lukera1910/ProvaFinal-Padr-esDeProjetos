package questao_4;

public class HistoricoUsuario extends Verificacao {
    protected boolean executar(Transacao t) {
        return t.scoreHistorico >= 50;
    }
}