package RedPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(int money, String name) {
        super(money, name);
    }

    public void receive(ArrayList<Integer> list){

        int index = new Random().nextInt(list.size());

        int delta = list.remove(index);

        int money = super.getMoney();

        super.setMoney(money + delta);
    }
}
