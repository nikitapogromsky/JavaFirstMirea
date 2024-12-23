package ru.mirea.task23;

import java.util.Arrays;

public class ArrayQueue {
    private Object[] queue;
    private int head;
    private int size;

    public ArrayQueue() {
        queue = new Object[10];
        head = 0;
        size = 0;
    }

    public void enqueue(Object element) {
        ensureCapacity(size + 1);
        queue[(head + size) % queue.length] = element;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[head];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(queue, null);
        head = 0;
        size = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > queue.length) {
            Object[] newQueue = new Object[queue.length * 2];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(head + i) % queue.length];
            }
            queue = newQueue;
            head = 0;
        }
    }
}