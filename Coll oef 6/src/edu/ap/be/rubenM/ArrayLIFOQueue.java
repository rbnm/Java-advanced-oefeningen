package edu.ap.be.rubenM;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
public class ArrayLIFOQueue<o> implements LIFOQueue<o>{
    private ArrayDeque<o> array;
    
    public ArrayLIFOQueue(o[] array) {
        List<o> list = Arrays.asList(array);
        ArrayDeque<o> ad = new ArrayDeque<>(list);
        this.array = ad;
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(O e) {
        array.addFirst(e);
    }

    @Override
    public O pop() {
        return array.pollFirst();
    }

    @Override
    public O peek() {
        return array.peek();
    }

	


    
    
}