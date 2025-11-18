package questao_5;

public class LoggerCentral {
    private static volatile LoggerCentral instancia;

    private LoggerCentral() {}

    public static LoggerCentral getInstancia() {
        if (instancia == null) {
            synchronized (LoggerCentral.class) {
                if (instancia == null) {
                    instancia = new LoggerCentral();
                }
            }
        }
        return instancia;
    }

    public void logArquivo(String mensagem) {
        System.out.println("Arquivo: " + mensagem);
    }

    public void logServidor(String mensagem) {
        System.out.println("Servidor: " + mensagem);
    }
}