package tqs;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class TqsStackTest {

    @Test
    void isEmptyOnConstruction() {
        TqsStack<Integer> stack = new TqsStack<>();

        assert(stack.isEmpty());
        assertEquals(0, stack.size());

    }

    @Test
    void afterNPushes() {
        TqsStack<Integer> stack = new TqsStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        assert(!stack.isEmpty());
        assertEquals(5, stack.size());
    }

    @Test
    void pushingX() {
        TqsStack<Integer> stack = new TqsStack<>();

        stack.push(42);

        assert(stack.peek() == 42 && stack.size() == 1);
        assert(stack.pop() == 42 && stack.isEmpty());
    }

    @Test
    void emptyExceptions() {
        TqsStack<Integer> stack = new TqsStack<>();

        assertThrows(NoSuchElementException.class, () -> stack.pop());
        assertThrows(NoSuchElementException.class, () -> stack.peek());
    }
}