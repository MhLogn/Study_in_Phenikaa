package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Wind extends Instrument{
    @Override
    void play(Note n){
        System.out.println("Wind.play() " + n);
    }
    @Override
    public String toString(){
        return "Wind";
    }
    @Override
    void adjust(){
        System.out.println("Adjusting Wind");
    }
}
