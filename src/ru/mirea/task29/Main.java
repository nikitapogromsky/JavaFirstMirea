package ru.mirea.task29;


// Тестовый класс
public class Main {
    public static void main(String[] args) {
        // Создание экземпляров Drink и Dish
        Drink drink = new Drink(150.0, "Лимонад", "Освежающий напиток с лимоном");
        Dish dish = new Dish(500.0, "Салат Цезарь", "Классический салат с курицей и соусом Цезарь");

        // Вывод информации о напитке
        System.out.println(drink);
        System.out.println("Цена напитка: " + drink.getPrice());
        System.out.println("Название напитка: " + drink.getName());
        System.out.println("Описание напитка: " + drink.getDescription());

        // Вывод информации о блюде
        System.out.println(dish);
        System.out.println("Цена блюда: " + dish.getPrice());
        System.out.println("Название блюда: " + dish.getName());
        System.out.println("Описание блюда: " + dish.getDescription());
    }
}
