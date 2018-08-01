package me.sn00pbom.interfacetest.funcs;

/**
 * @author Zachary Lefin
 * @since 8/1/18
 */
public final class Pass implements PassableFunc {


    @Override
    public double f(double x) {
        return x;
    }

    @Override
    public double df(double x) {
        return 1;
    }
}
