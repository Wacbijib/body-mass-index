public class BmiService {
    public int calculate(double weight, double height) {
        double index = weight / (height * height / 10_000);

        return (int) index;
    }

}
