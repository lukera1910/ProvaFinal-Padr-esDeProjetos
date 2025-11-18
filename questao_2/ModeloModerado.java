package questao_2;

public class ModeloModerado implements ModeloRisco {
    public double calcular(double patrimonio, double renda, double idade, double experiencia) {
        return (patrimonio * 0.4) + (renda * 0.4) - (idade * 0.1) + (experiencia * 0.3);
    }
}