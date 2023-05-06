public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kgWeight = 80.5;
        double mHeight = 1.60;
        int bmi = service.calculate(kgWeight, mHeight);

        System.out.println(bmi);
    }
}