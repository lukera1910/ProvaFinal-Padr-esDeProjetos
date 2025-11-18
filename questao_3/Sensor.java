package questao_3;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements SensorSubject {
    private double temperatura;
    private double umidade;
    private double poluicao;
    private List<Observador> observadores = new ArrayList<>();

    public void setMedidas(double temperatura, double umidade, double poluicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.poluicao = poluicao;
        notificar();
    }

    public void registrar(Observador o) {
        observadores.add(o);
    }

    public void remover(Observador o) {
        observadores.remove(o);
    }

    public void notificar() {
        for (Observador o : observadores) {
            o.atualizar(temperatura, umidade, poluicao);
        }
    }
}