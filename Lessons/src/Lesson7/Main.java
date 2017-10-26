package Lesson7;

import java.lang.ref.SoftReference;

public class Main {
    public static void main(String[] args) {
// Создание экземпляра анонимного класса: new Operation {...}
        Accumulator acc = new Accumulator(100, new Operation() {
            @Override
            public int apply(int arg1, int arg2) {
                return Math.abs(arg1) + Math.abs(arg2);
            }
        });
        Accumulator umn =  new Accumulator(13, new Operation() {
            @Override
            public int apply(int arg1, int arg2) {
                return arg1*arg2;
            }
        });

        acc.calculate(-10);
        acc.calculate(23);
        System.out.println(acc.getValue());

        umn.calculate(2);
        umn.calculate(3);
        System.out.println(umn.getValue());
    }
}