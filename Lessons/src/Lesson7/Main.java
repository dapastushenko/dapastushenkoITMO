package Lesson7;

public class Main {
    public static void main(String[] args) {
// Создание экземпляра анонимного класса: new Operation {...}
        Accumulator acc = new Accumulator(100, new Operation() {
            @Override
            public int apply(int arg1, int arg2) {
                return Math.abs(arg1) + Math.abs(arg2);
            }
        });
        acc.calculate(-10);
        acc.calculate(23);
        System.out.println(acc.getValue());
    }
}