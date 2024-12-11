package Main.java.com.mycompany.app.Code2.PolymorshismEx5;

public class Main {
    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle Tricycle = new Tricycle();

        unicycle.cycle();
        bicycle.cycle();
        Tricycle.cycle();
    }
}
