package questao_4;

public class Main {
    public static void main(String[] args) {
        Verificacao cadeia = new ValorSuspeito();
        cadeia
            .definirProxima(new GeoLocalizacao())
            .definirProxima(new HistoricoUsuario())
            .definirProxima(new DispositivoIncomum());

        Transacao t = new Transacao(3000, "BR", "ANDROID", 70);
        boolean resultado = cadeia.verificar(t);

        System.out.println("Aprovada: " + resultado);
    }
}