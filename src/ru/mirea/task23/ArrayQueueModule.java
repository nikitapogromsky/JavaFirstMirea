package ru.mirea.task23;

import java.util.Arrays;

public class ArrayQueueModule {
    private static Object[] queue = new Object[10];
    private static int head = 0;
    private static int size = 0;

    // Добавить элемент в очередь
    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        queue[(head + size) % queue.length] = element;
        size++;
    }

    // Получить первый элемент
    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[head];
    }

    // Удалить и вернуть первый элемент
    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
        size--;
        return result;
    }

    // Текущий размер очереди
    public static int size() {
        return size;
    }

    // Проверка, пуста ли очередь
    public static boolean isEmpty() {
        return size == 0;
    }

    // Очистить очередь
    public static void clear() {
        Arrays.fill(queue, null);
        head = 0;
        size = 0;
    }

    // Увеличить размер массива при необходимости
    private static void ensureCapacity(int capacity) {
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