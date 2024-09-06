package Main.java.com.mycompany.app;

public class Recursion {
    public long factorial(long i) {
        if(i <= 1){
            return 1;
        }
        else{
            return i * factorial(i -1);
        }
    }
}
