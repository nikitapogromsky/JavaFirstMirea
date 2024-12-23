package ru.mirea.task13;

// Класс Shirt
class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    // Конструктор
    public Shirt(String input) {
        String[] parts = input.split(",");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Неверный формат строки: " + input);
        }
        this.id = parts[0].trim();
        this.name = parts[1].trim();
        this.color = parts[2].trim();
        this.size = parts[3].trim();
    }

    // Метод toString для вывода информации о футболке
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Название: " + name + "\n" +
                "Цвет: " + color + "\n" +
                "Размер: " + size + "\n";
    }
}

// Основной класс
public class ShirtTest {
    public static void main(String[] args) {
        // Исходный массив строк
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        // Преобразование строкового массива в массив объектов Shirt
        Shirt[] shirtObjects = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++) {
            shirtObjects[i] = new Shirt(shirts[i]);
        }

        // Вывод информации о каждом объекте Shirt
        for (Shirt shirt : shirtObjects) {
            System.out.println(shirt);
        }
    }
}
