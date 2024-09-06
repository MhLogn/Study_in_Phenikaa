package Main.java.com.mycompany.app.Code2.AccessControlEx8;

public class TestConnection {
        public static void main(String[] args) {
            for (int i = 0; i < 7; i++) {
                Connection conn = ConnectionManager.getConnection();
                if (conn != null) {
                    conn.connect();
                }
            }
        }
    }
