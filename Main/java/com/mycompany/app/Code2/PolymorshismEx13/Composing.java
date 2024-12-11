package Main.java.com.mycompany.app.Code2.PolymorshismEx13;

public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Creating" +this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("Disposing" +this);
        shared.dispose();
    }

    protected void finalize(){
        System.out.println("Finalizing" + this);
    }

    public String toString(){
        return "Composing" + id;
    }
}
