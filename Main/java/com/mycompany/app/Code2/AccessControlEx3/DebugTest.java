package Main.java.com.mycompany.app.Code2.AccessControlEx3;
import Main.java.com.mycompany.app.Code2.AccessControlEx3.debug.Debug;
//import Main.java.com.mycompany.app.Code2.AccessControlEx3.debugoff.Debug;

public class DebugTest {
    public static void main(String[] args) {
        Debug.myBug("Hi");
    }
    //import debug.Debug sẽ trả về giá trị
    //còn import debugoff.Debug sẽ khôg trả về giá trị gì cả
}
