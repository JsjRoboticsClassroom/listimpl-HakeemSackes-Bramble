package nyc.c4q.ashiquechowdhury;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractList numbers = new OrderedList(7);
        numbers.add(34);
        numbers.add(4834);
        numbers.add(300);
        numbers.add(11);
        numbers.add(25);
        numbers.add(13);
        numbers.add(7);
        numbers.add(9);
        numbers.remove(8);
        for(int i = 0 ;  i < numbers.getSize(); i++) {
            System.out.println(numbers.get(i));
        }
        numbers.add(15);
    }
}
