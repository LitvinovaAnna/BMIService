public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 51;
        double h = 171;
        double BMI = service.calculate(m, h);
        System.out.println("Индекс массы тела " + BMI);

    }
}
