package task2.Figure;

import task2.AbilityToCalculateVolume;

public class Cylinder implements AbilityToCalculateVolume {
    private double radius;
    private double height;
    private double volume=getVolume();

    public Cylinder(double radius, double height) {
        if(radius>0 && height>0) {
            this.radius = radius;
            this.height = height;
            this.volume = getVolume();
        }else{
            throw new IllegalArgumentException("Incorrect parameters. All parameters must be >0");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            volume=getVolume();
        }else{
            throw new IllegalArgumentException("Radius must be >0, the volume will be 0");
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
            volume=getVolume();
        }else{
            throw new IllegalArgumentException("Height must be >0, the volume will be 0");
        }
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        double volume=0;
        if(radius>0 && height>0) {
            volume= Math.PI*Math.pow(radius,2)*height;;
        }
        return volume;


    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", volume=" + volume +
                '}';
    }
}
