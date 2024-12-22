package ru.mirea.task6;

public class TestRect {
    // Пример использования
        public static void main(String[] args) {
            ru.mirea.task6.MovableRectangle rectangle = new ru.mirea.task6.MovableRectangle(0, 0, 4, 4, 2, 2);
            System.out.println(rectangle);
            rectangle.moveUp();
            System.out.println(rectangle);
            rectangle.moveRight();
            System.out.println(rectangle);
        }
}
