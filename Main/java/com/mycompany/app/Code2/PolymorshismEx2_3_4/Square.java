package Main.java.com.mycompany.app.Code2.PolymorshismEx2_3_4;

public class Square  extends  Shape{
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
