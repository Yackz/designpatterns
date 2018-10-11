package O2;

import O1.Quackable;

public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        numberOfQuacks = 0;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks+=1;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
