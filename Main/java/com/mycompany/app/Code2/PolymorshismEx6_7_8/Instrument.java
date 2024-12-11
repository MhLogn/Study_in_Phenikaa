package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Instrument{
    public enum Note{
        MIDDLE_C, C_SHARP, B_FLAT;
    }
    void play(Note n){
        System.out.println("Instrument.play() " + n);
    }
    @Override
    public String toString(){
        return "Instrument";
    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}
