package Main.java.com.mycompany.app.Code2.AccessControlEx8;

public class ConnectionManager {
    private static Connection[] connections;
    private static int index = 0;
    private static final int MAX_CONNECTIONS = 5;
    static {
        connections = new Connection[MAX_CONNECTIONS];
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections[i] = Connection.makeConnection();
        }
    }

    public static Connection getConnection() {
        if (index < MAX_CONNECTIONS) {
            return connections[index++];
        } else {
            System.out.println("No connections");
            return null;
        }
    }
}
