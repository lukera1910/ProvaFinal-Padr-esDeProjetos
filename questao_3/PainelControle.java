package questao_3;

public class PainelControle implements Observador {
    public void atualizar(double temperatura, double umidade, double poluicao) {
        System.out.println("Painel: " + temperatura + "°C, " + umidade + "%, " + poluicao);
    }
}