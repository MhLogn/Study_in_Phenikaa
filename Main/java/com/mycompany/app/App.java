package Main.java.com.mycompany.app;
import Chap1.Demo;

import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Class Book
        Book myBook = new Book("HarryPotter","J.K.Rowling",900);
        System.out.println(myBook);

        //Class Time
        Time t1 = new Time();
        Time t2 = new Time(20,3,45);

        t1.setHour(7).setMinute(32).setSecond(23);
        System.out.println("T1 is " +t1);
        System.out.println("T2 is " +t2);

        //Class Recursion
        Recursion recursion = new Recursion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri cho a = ");
        int a = scanner.nextInt();
        scanner.close();
        recursion.factorial(a);
        System.out.println("Factorial 5 = " +recursion.factorial(a));

        //Class NameNumber và NNCollection
        NNCollection NameNumber = new NNCollection();
        NameNumber NN1 = new NameNumber("Long","0123456789");
        NameNumber NN2 = new NameNumber("Dung", "0123456789");

        NameNumber.insert(NN1);
        NameNumber.insert(NN2);
        String number = NameNumber.findNumber("Long");

        System.out.println("SDT cua Long: " +number);
        String number1 = NameNumber.findNumber("Dung");
        System.out.println("SDT cua Dung: " +number);

        String notFound = NameNumber.findNumber("Huy");
        System.out.println("SDT cua Huy: " +notFound);
    }
}