package ru.mirea.task4._1;

public class TestShape {
    public static void main(String[] args) {
        // Создание объектов разных фигур
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        // Вывод информации о каждой фигуре, используя родительскую ссылку
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
