package O1;

import O2.QuackCounter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadQuack = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdaptor(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());
        System.out.println("-Adapter Pattern-");
        System.out.println("Duck Simulator");
        simulate(mallardDuck);
        simulate(redheadQuack);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " time.");
        }
    void simulate(Quackable duck){
        duck.quack();
    }

}
