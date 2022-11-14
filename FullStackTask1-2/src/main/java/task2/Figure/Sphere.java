package task2.Figure;

import task2.AbilityToCalculateVolume;

public class Sphere implements AbilityToCalculateVolume {
    private double radius;
    private double volume=getVolume();

    public Sphere() {
    }

    public Sphere(double radius) {
        if(radius>0) {
            this.radius = radius;
            volume = getVolume();
        }else{
            throw new IllegalArgumentException("The radius must be >0");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>0) {
            this.radius = radius;
            volume = getVolume();
        }else{
            throw new IllegalArgumentException("The radius must be >0");
        }
    }

    @Override
    public double getVolume() {
        return 4.3*Math.PI*Math.pow(radius,3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", volume=" + volume +
                '}';
    }
}
