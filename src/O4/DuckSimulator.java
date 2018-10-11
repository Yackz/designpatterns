package O4;

import O1.Quackable;
import O2.QuackCounter;
import O3.AbstractDuckFactory;
import O3.CountingDuckFactory;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        System.out.println("-Composite pattern-");
        System.out.println("Duck Simulator");
        simulate(flockOfDucks);
        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
