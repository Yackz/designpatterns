package O3;

import O1.*;
import O2.QuackCounter;
import O2.QuackEcho;

public class EchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {

        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {

        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {

        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
