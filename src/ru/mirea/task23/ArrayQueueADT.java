package ru.mirea.task23;

import java.util.Arrays;

public class ArrayQueueADT {
    private Object[] queue;
    private int head;
    private int size;

    public ArrayQueueADT() {
        queue = new Object[10];
        head = 0;
        size = 0;
    }

    public static void enqueue(ArrayQueueADT queueADT, Object element) {
        ensureCapacity(queueADT, queueADT.size + 1);
        queueADT.queue[(queueADT.head + queueADT.size) % queueADT.queue.length] = element;
        queueADT.size++;
    }

    public static Object element(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queueADT.queue[queueADT.head];
    }

    public static Object dequeue(ArrayQueueADT queueADT) {
        if (isEmpty(queueADT)) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = queueADT.queue[queueADT.head];
        queueADT.queue[queueADT.head] = null;
        queueADT.head = (queueADT.head + 1) % queueADT.queue.length;
        queueADT.size--;
        return result;
    }

    public static int size(ArrayQueueADT queueADT) {
        return queueADT.size;
    }

    public static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.size == 0;
    }

    public static void clear(ArrayQueueADT queueADT) {
        Arrays.fill(queueADT.queue, null);
        queueADT.head = 0;
        queueADT.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queueADT, int capacity) {
        if (capacity > queueADT.queue.length) {
            Object[] newQueue = new Object[queueADT.queue.length * 2];
            for (int i = 0; i < queueADT.size; i++) {
                newQueue[i] = queueADT.queue[(queueADT.head + i) % queueADT.queue.length];
            }
            queueADT.queue = newQueue;
            queueADT.head = 0;
        }
    }
}
