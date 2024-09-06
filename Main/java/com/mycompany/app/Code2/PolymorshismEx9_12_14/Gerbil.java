package Main.java.com.mycompany.app.Code2.PolymorshismEx9_12_14;

public class Gerbil extends Rodent{
    private This m = new This("is Gerbil");
    @Override
    void eat() {
        System.out.println("Gerbil is eating seeds");
    }
    @Override
    void sleep() {
        System.out.println("Gerbil is sleeping in its burrow");
    }
}
