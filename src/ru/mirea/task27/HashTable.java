package ru.mirea.task27;

import java.util.LinkedList;

public class HashTable {
    // Внутренний класс для хранения пар ключ-значение
    static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int size = 16; // Размер хеш-таблицы
    private LinkedList<Entry>[] table; // Массив списков для обработки коллизий

    // Инициализация хеш-таблицы
    public void hashtabInit() {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
        System.out.println("Хеш-таблица инициализирована.");
    }

    // Хеш-функция
    public int hashtabHash(String key) {
        return Math.abs(key.hashCode() % size);
    }

    // Добавление элемента
    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        // Проверяем, существует ли уже ключ
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновляем значение
                System.out.println("Ключ " + key + " обновлён со значением " + value);
                return;
            }
        }
        bucket.add(new Entry(key, value));
        System.out.println("Ключ " + key + " добавлен со значением " + value);
    }

    // Поиск элемента по ключу
    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                System.out.println("Найдено значение для ключа " + key + ": " + entry.value);
                return entry.value;
            }
        }
        System.out.println("Ключ " + key + " не найден.");
        return null;
    }

    // Удаление элемента
    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                System.out.println("Ключ " + key + " удалён.");
                return;
            }
        }
        System.out.println("Ключ " + key + " не найден для удаления.");
    }

    // Тестирование
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.hashtabInit();

        hashTable.hashtabAdd("ключ1", "значение1");
        hashTable.hashtabAdd("ключ2", "значение2");
        hashTable.hashtabAdd("ключ3", "значение3");

        hashTable.hashtabLookup("ключ1");
        hashTable.hashtabLookup("ключ4");

        hashTable.hashtabAdd("ключ1", "обновлённое значение1");
        hashTable.hashtabLookup("ключ1");

        hashTable.hashtabDelete("ключ2");
        hashTable.hashtabLookup("ключ2");
    }
}
