package questao_4;

public class DispositivoIncomum extends Verificacao {
    protected boolean executar(Transacao t) {
        return !t.dispositivo.equals("DESCONHECIDO");
    }
}