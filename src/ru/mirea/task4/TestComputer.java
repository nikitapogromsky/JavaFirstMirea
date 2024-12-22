package ru.mirea.task4;

public class TestComputer {
    public static void main(String[] args) {
        // Создание объектов Processor, Memory и Monitor
        Processor processor = new Processor("Intel i7", 3.6, 8);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor(27.0, "1920x1080");
        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor);
        System.out.println(computer);
    }
}
