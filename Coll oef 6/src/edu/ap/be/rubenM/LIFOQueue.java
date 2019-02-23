package edu.ap.be.rubenM;


/**
 * LIFOQueue
 */
public interface LIFOQueue<A>  {

    public boolean isEmpty();
    public void push(A e);
    public A pop();
    public A peek();

}