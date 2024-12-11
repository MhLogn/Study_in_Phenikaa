package Main.java.com.mycompany.app.Code2.PolymorshismEx15;

public class RectangularGlyph extends Glyph {
    private int width = 2;
    private int height = 3;

    RectangularGlyph(int w, int h){
        width = w;
        height = h;
        System.out.println("RectangularGlyph(), width" +width + "height" +height);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw(), width = " + width + ", height = " + height);
    }
}
