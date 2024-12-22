package ru.mirea.task4;

public class main {

    // Определяем перечисление для времен года
    public enum Season {
        WINTER(-5), // Холодное время года
        SPRING(10), // Холодное время года
        SUMMER(25), // Теплое время года
        AUTUMN(15); // Холодное время года

        private final int averageTemperature;

        // Конструктор для инициализации средней температуры
        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        // Метод для получения средней температуры
        public int getAverageTemperature() {
            return averageTemperature;
        }

        // Метод для получения описания времени года
        public String getDescription() {
            if (this == SUMMER) {
                return "Теплое время года";
            } else {
                return "Холодное время года";
            }
        }
    }

    // Метод для обработки любимого времени года
    public static void printFavoriteSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        // Переменная с любимым временем года
        Season favoriteSeason = Season.SUMMER;

        // Печать информации о любимом времени года
        System.out.println("Ваше любимое время года: " + favoriteSeason);
        printFavoriteSeason(favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // Цикл для печати информации о всех временах года
        System.out.println("\nИнформация о всех временах года:");
        for (Season season : Season.values()) {
            System.out.println(season + ": Средняя температура " + season.getAverageTemperature() + "°C, Описание: " + season.getDescription());
        }
    }
}