package edu.ap.be.rubenM;

public class Main {
    public static void main(String[] args) {
        Integer[] rij = new Integer[] {1,2,3,4};
        ArrayLIFOQueue<Integer> array = new ArrayLIFOQueue<Integer>(rij);
        array.push(5);
        System.out.println(array.peek());
        array.pop();
        array.pop();
        array.pop();
        array.pop();
        System.out.println(array.isEmpty());        
        array.pop();
        System.out.println(array.isEmpty());        

    }
    
}