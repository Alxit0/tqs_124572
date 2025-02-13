package tqs;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TqsStack<T> {

    private final ArrayList<T> stack;

    public TqsStack(){
        this.stack = new ArrayList<T>();
    }

    public boolean isEmpty() {
        if (this.stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return this.stack.size();
    }

    public void push(T elemento) {
        stack.add(elemento);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return stack.remove(stack.size()-1);
        }
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return stack.get(stack.size()-1);
        }
    }

}