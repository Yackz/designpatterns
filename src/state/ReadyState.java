package state;

import java.util.Map;
import java.util.TreeMap;

public class ReadyState implements State {
    VendingMachine vendingMachine;
    Map<String, Integer> destinationMap = new TreeMap<>();

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationMap.put("A", 100);
        destinationMap.put("B", 250);
        destinationMap.put("C", 200);
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("ERROR");
    }

    @Override
    public void chooseDestination(String station) {
        if (destinationMap.containsKey(station)) {
            System.out.println("ERROR: Do not have station");
            return;
        }
        System.out.println("Selecting: " + station + " Price: " + destinationMap.get(station) + "$");
        vendingMachine.setPrice(destinationMap.get(station));
        vendingMachine.setCurrentState(vendingMachine.getExpenseState());
    }


    @Override
    public void getTicket() {
        System.out.println("ERROR");
    }
}
