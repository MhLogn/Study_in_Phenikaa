package Main.java.com.mycompany.app.Code2.PolymorshismEx2_3_4;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
