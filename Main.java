package RedPackage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(100,"群主");

        Member one = new Member(0,"A");
        Member two = new Member(0,"B");
        Member three = new Member(0,"C");

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=========");

        ArrayList<Integer> redList = manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=========");

    }

}
