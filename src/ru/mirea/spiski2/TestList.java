package ru.mirea.spiski2;

public class TestList {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        // Добавление элементов
        list.sortedInsert(5);
        list.sortedInsert(2);
        list.sortedInsert(8);
        list.sortedInsert(1);
        list.sortedInsert(3);

        System.out.println("Исходный список:");
        list.display();

        // Сортировка
        list.sort();

        System.out.println("Отсортированный список:");
        list.display();
    }
}
