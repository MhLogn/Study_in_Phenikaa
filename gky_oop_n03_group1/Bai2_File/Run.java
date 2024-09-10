package gky_oop_n03_group1.Bai2_File;

public class Run {
    public static void main(String[] args) {
        DiscreteSignal discreteSignal = new DiscreteSignal();
        discreteSignal.addSignalValue(1); // Thêm các giá trị tín hiệu rời rạc
        discreteSignal.addSignalValue(2);
        discreteSignal.addSignalValue(3);
        discreteSignal.transmit(); // Hiển thị tín hiệu rời rạc

        // Kiểm tra lớp Radar
        Radar radar = new Radar();
        radar.displaySignal();
    }
}