package Main.java.com.mycompany.app.Code2.PolymorshismEx9_12_14;

public class Hamster extends Rodent{
    private This m = new This("is Hamster");
    @Override
    void eat() {
        System.out.println("Hamster is eating pellets");
    }
    @Override
    void sleep() {
        System.out.println("Hamster is sleeping in its cage");
    }
}
