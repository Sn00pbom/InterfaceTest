package me.sn00pbom.interfacetest.funcs;

/**
 * @author Zachary Lefin
 * @since 8/1/18
 */
public class Linear implements PassableFunc {

    public Linear(double m, double b) {
        this.m = m;
        this.b = b;
    }
    private final double m;
    private final double b;

    @Override
    public double f(double x) {
        return m * x + b;
    }

    @Override
    public double df(double x) {
        return m;
    }

}
