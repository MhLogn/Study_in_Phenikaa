package Main.java.com.mycompany.app.Code2.AccessControlEx6;

public class Test_Protected {
    public static void main(String[] args) {
        Protected test = new Protected();

        test.RunProtected();

        test.ID = "Hello all";

        test.RunProtected();
    }
}
