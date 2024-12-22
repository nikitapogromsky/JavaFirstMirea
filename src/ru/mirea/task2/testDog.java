package ru.mirea.task2;

public class testDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sharik",5);
        Dog d2 = new Dog("Tuzik",7);
        System.out.println(d1.getName());
        System.out.println(d2.getAge());
        System.out.println(d1.toString());
        System.out.println(d2.getAgeForHuman());
    }

}
