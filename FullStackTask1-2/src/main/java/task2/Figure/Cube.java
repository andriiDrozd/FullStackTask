package task2.Figure;

import task2.AbilityToCalculateVolume;

public class Cube implements AbilityToCalculateVolume {
    private double a;
    private double volume;

    public Cube(double a) {
        if(a>0) {
            this.a = a;
            this.volume = getVolume();
        }else{
            throw new IllegalArgumentException("Side length must be >0");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
            volume=getVolume();
        }else{
            throw new IllegalArgumentException("Side length must be >0");
        }
    }


    @Override
    public double getVolume() {
        double volume=0;
        if(a>0) {
            volume= Math.pow(a, 3);
        }else{
            System.out.println("The side length incorrect-the volume will be 0");
        }
        return volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                ", volume=" + volume +
                '}';
    }
}
