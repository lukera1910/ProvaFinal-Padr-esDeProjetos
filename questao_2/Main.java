package questao_2;

public class Main {
    public static void main(String[] args) {
        CalculadoraRisco calc = new CalculadoraRisco();

        calc.setModelo(new ModeloAgressivo());
        System.out.println(calc.executar(200000, 8000, 30, 5));

        calc.setModelo(new ModeloModerado());
        System.out.println(calc.executar(200000, 8000, 30, 5));

        calc.setModelo(new ModeloConservador());
        System.out.println(calc.executar(200000, 8000, 30, 5));
    }
}