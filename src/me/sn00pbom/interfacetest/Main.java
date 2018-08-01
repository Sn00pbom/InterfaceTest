package me.sn00pbom.interfacetest;

import me.sn00pbom.interfacetest.funcs.Linear;
import me.sn00pbom.interfacetest.funcs.Quadratic;

public class Main {

    public static void main(String[] args) {
        Brain brain = new Brain();
        brain.setThought(15);

        brain.setFunc(new Quadratic(2, 3, 4));

        System.out.println(brain.calcf());
        System.out.println(brain.calcdf());

        brain.setThought(2);
        brain.setFunc(new Linear(2, 3));

        System.out.println(brain.calcf());
        System.out.println(brain.calcdf());

        // The result is that the object has the capability to calculate the value of a function
        // at a point as well as the derivative of that function at that point.
        // This setup will make emulating the chain rule later on quite easy.
    }
}
