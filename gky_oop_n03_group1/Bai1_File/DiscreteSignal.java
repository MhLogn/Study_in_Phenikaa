package gky_oop_n03_group1.Bai1_File;

import gky_oop_n03_group1.Bai1_File.Signal;

public class DiscreteSignal implements Signal {
    private double Amplitude;
    private double time;
    private double Period;
    private double wavelength;

    public DiscreteSignal(double A, double t, double N, double f){
        this.Amplitude= A;
        this.time = t;
        this.Period = N;
        this.wavelength = f;
    }

    @Override
    public double Amplitude() {
        return this.Amplitude;
    }

    @Override
    public double time() {
        return this.time;
    }

    @Override
    public double Period() {
        return this.Period;
    }

    @Override
    public double wavelength() {
        return this.wavelength;
    }

    @Override
    public void Parameter() {
        System.out.println("Thông số của DiscreteSignal: Biên độ(A) = " +this.Amplitude + " Tính thường xuyên(t) = " +this.time + " Chu kỳ(N) = " +this.Period + " Bước sóng(f) = " +this.wavelength);
    }
}
