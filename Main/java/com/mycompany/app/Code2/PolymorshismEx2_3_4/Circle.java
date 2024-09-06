package Main.java.com.mycompany.app.Code2.PolymorshismEx2_3_4;

public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
