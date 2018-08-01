package me.sn00pbom.interfacetest.funcs;

/**
 * @author Zachary Lefin
 * @since 8/1/18
 */
public class LeakyReLU implements PassableFunc {


    @Override
    public double f(double x) {
        double out;
        if (x > 0) {
            out = x;
        }else{
            out = x*.01;
        }
        return out;
    }

    @Override
    public double df(double x) {
        return 1;
    }
}
