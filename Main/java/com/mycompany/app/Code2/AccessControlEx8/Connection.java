package Main.java.com.mycompany.app.Code2.AccessControlEx8;

public class Connection {
    private Connection() {}
    public void connect() {
        System.out.println("CONNECT");
    }
    public static Connection makeConnection() {
        return new Connection();
    }
}
