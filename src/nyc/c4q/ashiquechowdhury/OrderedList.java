package nyc.c4q.ashiquechowdhury;

/**
 * Created by ashiquechowdhury on 9/7/16.
 */
public class OrderedList extends AbstractList{
    private int size;
    private Integer[] values;

    public OrderedList(int size){
        this.size = size;
        values = new Integer[size];
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    public void add(Integer integer) {
        boolean isFull = true;
        for (int i = 0; i < size; i++) {
            if (values[i] == null) {
                values[i] = integer;
                isFull = false;
                break;
            }
        }
        if(isFull){
            System.out.println("full array use SET()");
        }


    }

    @Override
    public Integer get(int index) {
        return values[index];
    }

    @Override
    public void set(int index, Integer value) {
        if (index < values.length && index > 0) {
            values[index] = value;
        } else {
            System.out.println("Err index out of bounds");
        }
    }

    @Override
    public void remove(int index) {
//        values[index] = null;
        set(index, null);
    }
}
