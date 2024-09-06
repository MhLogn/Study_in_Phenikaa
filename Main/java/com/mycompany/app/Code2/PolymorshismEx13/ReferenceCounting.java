package Main.java.com.mycompany.app.Code2.PolymorshismEx13;

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared),
                new Composing(shared), new Composing(shared),
        new Composing(shared), new Composing(shared) };

        for(Composing C : composings){
            C.dispose();
        }
    }
}
