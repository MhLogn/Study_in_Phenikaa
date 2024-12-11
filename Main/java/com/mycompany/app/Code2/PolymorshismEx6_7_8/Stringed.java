package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Stringed extends  Instrument{
    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
