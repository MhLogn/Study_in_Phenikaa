package OOP_N03_WEEK1;

public class Assignment2 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();

        //n1.i gán giá trị là 2
        n1.i = 2;

        //n2.i gán giá trị là 5
        n2.i = 5;

        //n1 và n2 tham chiếu đến cùng 1 đối tượng
        n1 = n2;

        //Thay đổi giá trị n2.i = 10 => n1,i = 10
        n2.i = 10;
        System.out.println("n1.i = " + n1.i);
        //Output: n1.i = 10

        //Thay đổi giá trị n1.i = 20 => n2.i = 20
        n1.i =20;
        System.out.println("n2.i = " + n2.i);
        //Output: n2.i = 20
    }
}
