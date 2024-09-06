package Main.java.com.mycompany.app.Code2.PolymorshismEx9_12_14;

public class RodentTest {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
        for(Rodent rodent : rodents){
            rodent.eat();
            rodent.sleep();
        }

        System.out.println("A Mouse");
        Rodent mouse = new Mouse();
        mouse.eat();
        mouse.sleep();

        System.out.println("A Gerbil");
        Rodent gerbil = new Gerbil();
        gerbil.eat();
        gerbil.sleep();

        System.out.println("A Hamster");
        Rodent hamster = new Hamster();
        hamster.eat();
        hamster.sleep();
    }
}
