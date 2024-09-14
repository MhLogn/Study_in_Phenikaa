package OOP_N03_WEEK4.InterfacesExercise21;

public class ChildInterface implements Interface {
    @Override
    public double Tong(double a, double b) {
        return a + b;
    }

    @Override
    public double Hieu(double a, double b) {
        return a - b;
    }
}
