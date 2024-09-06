package Main.java.com.mycompany.app.Code2.PolymorshismEx13;

public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("Creating" +this);
    }

    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if(refcount == 0){
            System.out.println("Disprosing" +this);
        }
    }

    protected void finalize(){
        if(refcount != 0){
            System.out.println("Error:" +refcount + "Shared" +id + "obj is use");
        }else{
            System.out.println("Finalizing" +this);
        }
    }
    public String toString(){
        return "Shared" +id;
    }
}
