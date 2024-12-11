package gky_oop_n03_group1.Bai1_File;

import gky_oop_n03_group1.Bai1_File.Signal;

public class RunSignal {
    public static void main(String[] args) {
        Signal discreteSignal = new DiscreteSignal(4,8,0.2,200);

        Signal continuousSignal = new ContinuousSignal(8,4, 0.1, 300);

        discreteSignal.Parameter();
        continuousSignal.Parameter();
    }
}
