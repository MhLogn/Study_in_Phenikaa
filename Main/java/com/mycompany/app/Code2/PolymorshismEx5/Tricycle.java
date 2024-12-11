package Main.java.com.mycompany.app.Code2.PolymorshismEx5;

public class Tricycle extends Cycle {
    @Override
    int wheels(){
        return 3;
    }
    @Override
    void cycle(){
        System.out.println("Riding a tricycle with " + wheels() + " wheels.");
    }
}
