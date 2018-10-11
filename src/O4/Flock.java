package O4;

import O1.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){

        quackers.add(quacker);
    }
    @Override
    public void quack() {
        boolean checkFirst = true;
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            if(checkFirst){
                System.out.print("Leader: ");
                quacker.quack();
                System.out.print("Leader: ");
                quacker.quack();
                System.out.print("Leader: ");
                quacker.quack();
                checkFirst = false;
            }
            else{
                quacker.quack();
            }
        }
    }
}
