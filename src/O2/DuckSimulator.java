package O2;

import O1.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadQuack = new QuackCounter(new QuackEcho((new RedheadDuck())));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable goose = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());
        System.out.println("-Decoratpr Pattern-");
        System.out.println("Duck Simulator");
        simulate(mallardDuck);
        simulate(redheadQuack);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }
    void simulate(Quackable duck){
        duck.quack();
    }

}

