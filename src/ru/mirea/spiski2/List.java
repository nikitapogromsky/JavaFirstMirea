package ru.mirea.spiski2;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

// Двусвязный циклический список
class DoublyCircularLinkedList {
    Node head = null;

    // Метод для вставки с сохранением упорядоченности
    public void sortedInsert(int data) {
        Node newNode = new Node(data);

        // Если список пуст
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node current = head;
            do {
                if (data < current.data) {
                    // Вставка перед текущим узлом
                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev.next = newNode;
                    current.prev = newNode;

                    if (current == head) { // Обновление головы
                        head = newNode;
                    }
                    return;
                }
                current = current.next;
            } while (current != head);

            // Вставка в конец списка
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Метод для сортировки списка
    public void sort() {
        if (head == null || head.next == head) {
            return; // Список пуст или содержит один элемент
        }

        Node sortedHead = null;

        // Извлечение минимального элемента и вставка в новый список
        while (head != null) {
            Node minNode = head;
            Node current = head.next;

            // Поиск узла с минимальным значением
            while (current != head) {
                if (current.data < minNode.data) {
                    minNode = current;
                }
                current = current.next;
            }

            // Удаление минимального узла из исходного списка
            if (minNode == head) {
                head = head.next;
            }
            minNode.prev.next = minNode.next;
            minNode.next.prev = minNode.prev;

            if (head == minNode) {
                head = (head == head.next) ? null : head.next;
            }

            // Вставка минимального узла в новый список
            if (sortedHead == null) {
                sortedHead = minNode;
                sortedHead.next = sortedHead;
                sortedHead.prev = sortedHead;
            } else {
                Node sortedCurrent = sortedHead.prev;
                sortedCurrent.next = minNode;
                minNode.prev = sortedCurrent;
                minNode.next = sortedHead;
                sortedHead.prev = minNode;
            }
        }

        // Замена исходного списка отсортированным
        head = sortedHead;
    }

    // Вывод списка
    public void display() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
