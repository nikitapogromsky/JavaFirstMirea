package ru.mirea.task3;

public class Main2 {
    public static void main(String[] args) {
        // 1. Создайте объекты класса Double, используя методы valueOf()
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.718");

        // 2. Преобразовать значение типа String к типу double
        double parsedValue = Double.parseDouble("1.618");

        // 3. Преобразовать объект класса Double ко всем примитивным типам
        double primitiveDouble = doubleObject1.doubleValue(); // Преобразование к типу double
        float primitiveFloat = doubleObject1.floatValue(); // Преобразование к типу float
        long primitiveLong = doubleObject1.longValue(); // Преобразование к типу long
        int primitiveInt = doubleObject1.intValue(); // Преобразование к типу int

        // 4. Вывести значение объекта Double на консоль
        System.out.println("Объект Double 1: " + doubleObject1);
        System.out.println("Объект Double 2: " + doubleObject2);
        System.out.println("Преобразованное значение из String: " + parsedValue);

        System.out.println("Примитивный double: " + primitiveDouble);
        System.out.println("Примитивный float: " + primitiveFloat);
        System.out.println("Примитивный long: " + primitiveLong);
        System.out.println("Примитивный int: " + primitiveInt);

        // 5. Преобразовать литерал типа double к строке
        String d = Double.toString(3.14);
        System.out.println("Литерал типа double в строке: " + d);
    }
}