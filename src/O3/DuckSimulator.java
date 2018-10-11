package O3;

import O1.Goose;
import O1.GooseAdaptor;
import O1.Quackable;
import O2.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
        System.out.println("-------------------------------------------");

        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        simulator.simulate(countingDuckFactory);
        System.out.println("-------------------------------------------");

        AbstractDuckFactory echoDuckFactory = new EchoDuckFactory();
        simulator.simulate(echoDuckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdaptor(new Goose());
        System.out.println("-Abstract Factory-");
        System.out.println("Duck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck){
        duck.quack();
    }

}
