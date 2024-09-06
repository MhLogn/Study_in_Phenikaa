package Main.java.com.mycompany.app.Code2.AccessControlEx5;

import javax.annotation.processing.SupportedSourceVersion;

public class Access {
    String name = "Dung and Long";
    public String Class = "OOP_N03";
    protected String Group = "Goup1";
    private int MSV = 12345678;

    public void Public_Method(){
        System.out.println("Public");
    }

    protected void Protected_Method(){
        System.out.println("Protected");
    }

    private void Private_Method(){
        System.out.println("Private");
    }

    public void RunPrivate(){
        System.out.println(MSV);
        Private_Method();
    }
}
