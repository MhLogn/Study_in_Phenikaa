package Main.java.com.mycompany.app.Code2.PolymorshismEx9_12_14;

public class Share {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Share(){
        System.out.println("Creating " + this);
    }

    public void addRef(){
        refCount++;
        System.out.println("Number of references to " + this + ": " + refCount);
    }

    public void release(){
        refCount--;
        System.out.println("Releasing " + this + ", remaining references: " + refCount);
        if (refCount == 0) {
            System.out.println("No references left, cleaning up " + this);
        }
    }

    @Override
    public String toString(){
        return "Shared " + id;
    }
}
