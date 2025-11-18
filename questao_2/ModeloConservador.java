package questao_2;

public class ModeloConservador implements ModeloRisco {
    public double calcular(double patrimonio, double renda, double idade, double experiencia) {
        return (patrimonio * 0.2) + (renda * 0.5) - (idade * 0.05) + (experiencia * 0.1);
    }
}