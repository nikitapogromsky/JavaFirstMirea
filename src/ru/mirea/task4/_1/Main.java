package ru.mirea.task4._1;

// Базовый класс Shape (Фигура)
abstract class Shape {
    // Метод для получения типа фигуры
    public abstract String getType();

    // Метод для вычисления площади
    public abstract double getArea();

    // Метод для вычисления периметра
    public abstract double getPerimeter();

    // Метод toString для вывода информации о фигуре
    @Override
    public String toString() {
        return "Тип фигуры: " + getType() +
                ", Площадь: " + getArea() +
                ", Периметр: " + getPerimeter();
    }
}

// Класс Circle (Круг), наследует Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() +
                ", Радиус: " + radius +
                ", Площадь: " + getArea() +
                ", Периметр: " + getPerimeter();
    }
}

// Класс Rectangle (Прямоугольник), наследует Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() +
                ", Ширина: " + width +
                ", Высота: " + height +
                ", Площадь: " + getArea() +
                ", Периметр: " + getPerimeter();
    }
}

// Класс Square (Квадрат), наследует Shape
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() +
                ", Сторона: " + side +
                ", Площадь: " + getArea() +
                ", Периметр: " + getPerimeter();
    }
}
