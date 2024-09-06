package Main.java.com.mycompany.app.Code2.AccessControlEx8;

public class Soup2 {
    private Soup2(){}
    private static Soup2 instance = new Soup2();
    public static Soup2 access(){
        return instance;
    }
    public void f(){
        System.out.println("f()");
    }
}
