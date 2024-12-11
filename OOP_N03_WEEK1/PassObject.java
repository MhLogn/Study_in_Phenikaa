package OOP_N03_WEEK1;

public class PassObject {
    //Gọi 1 phương thức f kiểu Number
    static void f(Number m) {
        m.i = 15;
    }
    public static void main(String[] args) {
        Number n = new Number();
        //Giá trị n.i là 14
        n.i =14;

        //Gọi phương thức
        f(n);
        System.out.println("n.i = " + n.i);

        //Output: n.i = 15
    }
}
