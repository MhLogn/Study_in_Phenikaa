package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Brass extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
