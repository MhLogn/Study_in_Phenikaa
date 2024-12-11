package OOP_N03_WEEK4;

import OOP_N03_WEEK4.InterfacesExercise21.ChildInterface;
import OOP_N03_WEEK4.InterfacesExercise21.NestedClass;
import OOP_N03_WEEK4.PolymorphismEx17.Bicycle;
import OOP_N03_WEEK4.PolymorphismEx17.Cycle;
import OOP_N03_WEEK4.PolymorphismEx17.Tricycle;
import OOP_N03_WEEK4.PolymorphismEx17.Unicycle;

public class Main {
    public static void main(String[] args) {
        //PolymorphismEx17
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        unicycle.balance();
        bicycle.balance();

        //Interface EX21
        ChildInterface math0 = new ChildInterface();
        //Gọi các phương thức tĩnh
        NestedClass.Cong_tru(math0);
    }
}
