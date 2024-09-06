package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Music3 {
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

    public static void tune(Instrument i) {
        i.play(Instrument.Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Electronic(),
        };
        for(Instrument i : orchestra){
            System.out.println(i);
        }

        Instrument[] orc = new Instrument[6];
        for(int i = 0; i < orchestra.length; i++){
            orchestra[i] = gen.next();
        }
        for(Instrument i : orchestra) {
            System.out.println(i);
        }
        tuneAll(orchestra);
    }
}
