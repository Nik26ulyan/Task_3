package ru.vsu.sc.uliyanov_n_s.figures;

public class Line {
    public double x0;
    public double y0;
    public double a;

    public Line(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointBelowLine(double x, double y) {
        return y < a * (x + x0) + y0;
    }
}

