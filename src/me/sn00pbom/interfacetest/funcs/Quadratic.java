package me.sn00pbom.interfacetest.funcs;

/**
 * @author Zachary Lefin
 * @since 8/1/18
 */
public class Quadratic implements PassableFunc {

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private final double a;
    private final double b;
    private final double c;

    @Override
    public double f(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }

    @Override
    public double df(double x) {
        return 2 * a * x + b;
    }
}
