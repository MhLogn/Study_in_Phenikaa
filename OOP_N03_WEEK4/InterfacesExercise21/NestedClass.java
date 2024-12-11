package OOP_N03_WEEK4.InterfacesExercise21;

public class NestedClass {
    //Tạo 1 phương thức tĩnh
    public static void Cong_tru(Interface math) {
        double Cong = math.Tong(1, 2);
        double Hieu = math.Hieu(4, 3);

        System.out.println("Phép cộng của 2 số a và b = " +Cong);
        System.out.println("Phép trừ của 2 số a và b = " +Hieu);
    }
}
