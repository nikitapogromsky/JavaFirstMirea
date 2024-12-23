package ru.mirea.task20;

// Обобщённый класс с параметрами T, V, K
class Triple<T, V, K> {
    private T first; // Переменная типа T
    private V second; // Переменная типа V
    private K third; // Переменная типа K

    // Конструктор, принимающий параметры T, V, K
    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Метод для получения значения переменной типа T
    public T getFirst() {
        return first;
    }

    // Метод для получения значения переменной типа V
    public V getSecond() {
        return second;
    }

    // Метод для получения значения переменной типа K
    public K getThird() {
        return third;
    }

    // Метод, выводящий имена классов переменных
    public void printClassNames() {
        System.out.println("Класс первого параметра (T): " + first.getClass().getName());
        System.out.println("Класс второго параметра (V): " + second.getClass().getName());
        System.out.println("Класс третьего параметра (K): " + third.getClass().getName());
    }
}

// Основной класс для проверки
public class Main {
    public static void main(String[] args) {
        // Создание объекта Triple с разными типами
        Triple<String, Integer, Double> triple = new Triple<>("Текст", 42, 3.14);

        // Вывод значений
        System.out.println("Первый параметр: " + triple.getFirst());
        System.out.println("Второй параметр: " + triple.getSecond());
        System.out.println("Третий параметр: " + triple.getThird());

        // Вывод имён классов
        System.out.println("\nИмена классов переменных:");
        triple.printClassNames();
    }
}