// Student name: Alice

package edu.utopiatech.cs1337.hw1;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LLStack implements StackInterface {
    private LinkedList backingLL;

    public LLStack() {
        backingLL = new LinkedList();
    }

    @Override
    public void push(Object o) {
        backingLL.add(o);
    }

    @Override
    public Object pop() {
        return backingLL.remove();
    }

    @Override
    public boolean isEmpty() {
        return backingLL.isEmpty();
    }
}
