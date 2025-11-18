package questao_3;

public interface SensorSubject {
    void registrar(Observador o);
    void remover(Observador o);
    void notificar();
}