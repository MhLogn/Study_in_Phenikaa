package Main.java.com.mycompany.app.Code2.PolymorshismEx5;

public class Bicycle extends Cycle{
    @Override
    int wheels(){
        return 2;
    }
    @Override
    void cycle(){
        System.out.println("Riding a bicycle with " + wheels() + " wheels.");
    }
}
