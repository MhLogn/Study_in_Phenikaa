package Main.java.com.mycompany.app.Code2.AccessControlEx8;

public class Lunch {
    void testPrivate() {
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }

    public static void main(String[] args) {
        Lunch lunch = new Lunch();

        lunch.testPrivate();
        lunch.testStatic();
        lunch.testSingleton();
    }
}
