package O2;

import O1.Quackable;

public class QuackEcho implements Quackable {

    Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("ECHO: ");
        duck.quack();
    }
}
