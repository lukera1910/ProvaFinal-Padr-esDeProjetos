package questao_3;

public class ModuloAlertas implements Observador {
    public void atualizar(double temperatura, double umidade, double poluicao) {
        System.out.println("Alertas verificados.");
    }
}