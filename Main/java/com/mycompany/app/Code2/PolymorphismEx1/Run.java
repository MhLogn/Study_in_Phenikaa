package Main.java.com.mycompany.app.Code2.PolymorphismEx1;

public class Run {
    public static void main(String[] args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        unicycle.cycle();
        bicycle.cycle();
        tricycle.cycle();
    }
}

