package ru.mirea.task29;

// Класс Dish (Immutable)
public final class Dish implements Item {
    private final double price;      // Стоимость
    private final String name;       // Название
    private final String description; // Описание

    public Dish(double price, String name, String description) {
        if (price < 0) throw new IllegalArgumentException("Цена не может быть отрицательной!");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Название не может быть пустым!");
        if (description == null || description.isEmpty()) throw new IllegalArgumentException("Описание не может быть пустым!");

        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Блюдо {" +
                "Цена = " + price +
                ", Название = '" + name + '\'' +
                ", Описание = '" + description + '\'' +
                '}';
    }
}