package Main.java.com.mycompany.app.Code2.PolymorshismEx9_12_14;

public class Mouse extends Rodent{
    private This m = new This("is Mouse");
    @Override
    void eat() {
        System.out.println("Mouse is eating cheese");
    }
    @Override
    void sleep() {
        System.out.println("Mouse is sleeping in a small hole");
    }
}
