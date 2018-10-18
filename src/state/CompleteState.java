package state;

public class CompleteState implements State {
    VendingMachine vendingMachine;

    public CompleteState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("ERROR");
    }

    @Override
    public void chooseDestination(String station) {
        System.out.println("ERROR");
    }

    @Override
    public void getTicket() {
        System.out.println("Thank you for your payment.");
        vendingMachine.setCurrentState(vendingMachine.getReadyState());
    }
}
