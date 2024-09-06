package Main.java.com.mycompany.app.Code2.PolymorshismEx6_7_8;

public class Electronic extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Electronic.play()" +n);
    }
    public String toString(){
        return "Electronic";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Electronic");
    }
}
