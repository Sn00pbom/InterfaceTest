package me.sn00pbom.interfacetest;

import me.sn00pbom.interfacetest.funcs.PassableFunc;
import me.sn00pbom.interfacetest.funcs.Pass;

/**
 * @author Zachary Lefin
 * @since 8/1/18
 */
public class Brain {
    public Brain() {
        this.thought = 0;
        this.func = new Pass();
    }

    private double thought;
    private PassableFunc func;

    public double calcf() {
        return this.func.f(this.getThought());
    }

    public double calcdf() {
        return this.func.df(this.getThought());
    }

    public double getThought() {
        return thought;
    }

    public void setThought(double thought) {
        this.thought = thought;
    }

    public PassableFunc getFunc() {
        return func;
    }

    public void setFunc(PassableFunc func) {
        this.func = func;
    }
}
