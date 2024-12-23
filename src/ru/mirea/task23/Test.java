package ru.mirea.task23;

public class Test {
    public static void main(String[] args) {
        // Тест ArrayQueueModule
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удаление: " + ArrayQueueModule.dequeue());
        System.out.println("Размер: " + ArrayQueueModule.size());

        // Тест ArrayQueueADT
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueADT, "Привет");
        ArrayQueueADT.enqueue(queueADT, "Мир");
        System.out.println("Первый элемент: " + ArrayQueueADT.element(queueADT));
        System.out.println("Удаление: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("Размер: " + ArrayQueueADT.size(queueADT));

        // Тест ArrayQueue
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удаление: " + queue.dequeue());
        System.out.println("Размер: " + queue.size());
    }
}