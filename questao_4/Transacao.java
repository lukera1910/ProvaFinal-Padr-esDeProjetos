package questao_4;

public class Transacao {
    public double valor;
    public String geo;
    public String dispositivo;
    public int scoreHistorico;

    public Transacao(double valor, String geo, String dispositivo, int scoreHistorico) {
        this.valor = valor;
        this.geo = geo;
        this.dispositivo = dispositivo;
        this.scoreHistorico = scoreHistorico;
    }
}