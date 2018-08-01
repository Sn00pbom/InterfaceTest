package me.sn00pbom.interfacetest.funcs;

/**
 * @author Zachary Lefin
 * @since 8/1/18
 */
public final class Sigmoid implements PassableFunc {

    @Override
    public double f(double x) {
        double out = 1 / (1 + Math.exp(-x));
        return out;
    }

    @Override
    public double df(double x) {
        double out = Math.exp(-x) / Math.pow(1 + Math.exp(-x), 2);
        return out;
    }
}
