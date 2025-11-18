package questao_5;

public class Main {
    public static void main(String[] args) {
        LoggerCentral logger = LoggerCentral.getInstancia();

        logger.logArquivo("Erro ao conectar");
        logger.logServidor("Evento enviado");
    }
}