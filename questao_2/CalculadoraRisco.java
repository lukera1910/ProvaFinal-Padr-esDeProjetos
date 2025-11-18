package questao_2;

public class CalculadoraRisco {
    private ModeloRisco modelo;

    public void setModelo(ModeloRisco modelo) {
        this.modelo = modelo;
    }

    public double executar(double patrimonio, double renda, double idade, double experiencia) {
        return modelo.calcular(patrimonio, renda, idade, experiencia);
    }
}