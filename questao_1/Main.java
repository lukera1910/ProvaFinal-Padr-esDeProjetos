public class Main {
    public static void main(String[] args) {
        RelatorioCreator diario = new RelatorioDiarioCreator();
        diario.processar();

        RelatorioCreator emergencial = new RelatorioEmergencialCreator();
        emergencial.processar();
    }
}