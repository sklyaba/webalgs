package ru.algs;

public class ShotTrajectory {


    public static void main(String[] args) {

        Equations equations = new Equations(150, 10.0);

        double R = 3600.0; // meters


        double H = equations.getTimeByHCoordinate(R);
        double Y = equations.yCoordinate(H);

        double hAim = 1.0;

        if (Y > H && Y <= H + hAim) {
            System.out.println("BULL EYE!");
        }
        else System.out.println("It's out the aim!");

        System.out.println("H is " + H);
        System.out.println("Y is " + Y);

    }
}

class Equations {

    private final static double G = 9.8;

    private final double v;
    private final double alpha;

    public Equations(double v, double alpha) {
        this.v = v;
        this.alpha = alpha;
        if (this.alpha > 360)
            throw new IllegalArgumentException("Alpha degree must be less than 360 and more than 0");
    }

    public double xCoordinate(double t) {
        return v * t / Math.cos(alpha);
    }

    public double yCoordinate(double t) {
        return Math.abs((v * t * Math.sin(alpha) - ((Math.pow(t, 2) * G) / 2)));
    }

    public double getTimeByHCoordinate(double x) {
        return Math.abs(x / (v * Math.cos(alpha)));
    }
}
