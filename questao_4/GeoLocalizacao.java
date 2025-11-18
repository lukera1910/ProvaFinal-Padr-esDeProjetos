package questao_4;

public class GeoLocalizacao extends Verificacao {
    protected boolean executar(Transacao t) {
        return t.geo.equals("BR");
    }
}