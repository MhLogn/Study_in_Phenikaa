package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Woodwind extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}
