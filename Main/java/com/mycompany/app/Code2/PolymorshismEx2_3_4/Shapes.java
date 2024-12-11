package Main.java.com.mycompany.app.Code2.PolymorshismEx2_3_4;

public class Shapes {
    private static RandonShapeGenerator gen = new RandonShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i++){
            s[i] = gen.next();
        }
        for(Shape shp : s)
            shp.draw();
    }
}
