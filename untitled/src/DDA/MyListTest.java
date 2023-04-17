package DDA;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<Integer>();
        listInt.add(0,1);
        listInt.add(1,2);

        listInt.remove(3);
        System.out.println(listInt.size());
        System.out.println("element 1: "+listInt.get(0));
        System.out.println("element 2: "+listInt.get(1));
    }
}