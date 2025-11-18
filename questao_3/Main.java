package questao_3;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        sensor.registrar(new PainelControle());
        sensor.registrar(new ModuloAlertas());
        sensor.registrar(new ModuloHistorico());

        sensor.setMedidas(28.4, 65.0, 120.0);
        sensor.setMedidas(29.0, 63.0, 118.0);
    }
}