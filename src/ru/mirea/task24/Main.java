package ru.mirea.task24;

// Интерфейс Abstract Factory
interface ComplexAbstractFactory {
    Complex createComplex(); // Создать комплексное число по умолчанию
    Complex createComplex(int real, int imaginary); // Создать комплексное число с заданными параметрами
}

// Класс Complex - представление комплексного числа
class Complex {
    private int real;      // Действительная часть
    private int imaginary; // Мнимая часть

    // Конструктор
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттер для действительной части
    public int getReal() {
        return real;
    }

    // Геттер для мнимой части
    public int getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

// Класс ConcreteFactory, реализующий фабрику
class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        // Возвращает комплексное число по умолчанию
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        // Создает комплексное число с указанными значениями
        return new Complex(real, imaginary);
    }
}

// Основной класс для проверки
public class Main {
    public static void main(String[] args) {
        // Создаем фабрику
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создаем комплексное число по умолчанию
        Complex defaultComplex = factory.createComplex();
        System.out.println("Комплексное число по умолчанию: " + defaultComplex);

        // Создаем комплексное число с заданными параметрами
        Complex customComplex = factory.createComplex(3, 4);
        System.out.println("Комплексное число с заданными параметрами: " + customComplex);
    }
}