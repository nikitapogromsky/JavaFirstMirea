package ru.mirea.task9;

class Student {
    private int iDNumber; // Уникальный номер студента
    private String name; // Имя студента

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

public class TestStudent {
    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
                new Student(103, "Anton"),
                new Student(101, "Bob"),
                new Student(104, "Viktor"),
                new Student(102, "Maria")
        };

        System.out.println("До сортировки:");
        printArray(students);

        // Сортируем массив вставками по iDNumber
        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        printArray(students);
    }

    // Метод для сортировки вставками
    public static void insertionSort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student key = array[i];
            int j = i - 1;

            // Сдвигаем элементы, которые больше ключа, вправо
            while (j >= 0 && array[j].getiDNumber() > key.getiDNumber()) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key; // Вставляем ключ на правильное место
        }
    }

    // Метод для вывода массива студентов
    public static void printArray(Student[] array) {
        for (Student student : array) {
            System.out.println(student);
        }
    }
}
