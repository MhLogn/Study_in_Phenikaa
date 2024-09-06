package OOP_N03_WEEK1;

public class Assignment1 {
    public static void main(String[] args) {
        //Tạo 2 đối tượng cho class Number
        Number n1 = new Number();
        Number n2 =new Number();

        //n1.i gán giá trị là 2
        n1.i = 2;

        //n2.i gán giá trị là 5
        n2.i = 5;

        //n1.i được gán giá trị là n2,i => giá trị của n1.i = 5
        n1.i = n2.i;

        //Sau đó thay đổi giá trị của n2.i = 10
        //Không ảnh hưởng đến giá trị của n1.i => n1.i =5
        //n1.i và n2.i là các biến độc lập
        n2.i = 10;

        System.out.println("n1.i = " + n1.i);
        //Giá trị trả về ở đây là n1.i = 5
    }
}
