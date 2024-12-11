package Main.java.com.mycompany.app.Code2.AccessControlEx5;

import java.awt.desktop.SystemSleepEvent;

public class AccessTest {
    public static void main(String[] args) {
        Access test = new Access();
        //Public
        System.out.println(test.name);
        System.out.println(test.Class);
        test.Public_Method();

        //Protected
        System.out.println(test.Group);
        test.Protected_Method();

//        //Private- Lỗi
//        System.out.println(test.MSV);
//        test.Private_Method();

        //Truy cập Private bằng
        test.RunPrivate();
    }
//    Public - truy câp ở mọi nơi
//    Protected - có thể truy cập cùng gói và các lớp con ở gói khác
//    Private - chỉ có thể truy cập được ở trong 1 lớp đó
}
