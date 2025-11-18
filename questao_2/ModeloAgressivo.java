package questao_2;

public class ModeloAgressivo implements ModeloRisco {
    public double calcular(double patrimonio, double renda, double idade, double experiencia) {
        return (patrimonio * 0.6) + (renda * 0.3) - (idade * 0.2) + (experiencia * 0.5);
    }
}
