package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
