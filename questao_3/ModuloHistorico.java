package questao_3;

public class ModuloHistorico implements Observador {
    public void atualizar(double temperatura, double umidade, double poluicao) {
        System.out.println("Registro salvo.");
    }
}