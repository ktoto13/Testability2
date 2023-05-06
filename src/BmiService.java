public class BmiService {
    public int calculate(double kgWeight, double mHeight) {
        double result = kgWeight / (mHeight * mHeight);
        return (int) result;
    }
}
