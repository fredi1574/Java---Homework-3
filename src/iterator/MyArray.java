package iterator;

import java.util.NoSuchElementException;

public class MyArray implements MyIterator {

    private int[] array;
    private int index = -1;

    public MyArray(int[] array) {
        this.array = array;
    }

    @Override
    public int next() {
        index++;
        if (index == array.length) {
            throw new NoSuchElementException();
        }
        return array[index];
    }

    @Override
    public boolean hasNext() {
        //fix question no 1
        return (index + 1) != array.length;
    }
}
