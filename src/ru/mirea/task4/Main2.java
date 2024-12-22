package ru.mirea.task4;

// Перечисление марок компьютеров
enum ComputerBrand {
    DELL, HP, ASUS, LENOVO, APPLE
}

// Класс Processor (Процессор)
class Processor {
    private String model;
    private double speed; // скорость в ГГц
    private int cores; // количество ядер

    public Processor(String model, double speed, int cores) {
        this.model = model;
        this.speed = speed;
        this.cores = cores;
    }

    // Геттеры
    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public int getCores() {
        return cores;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Processor [Model: " + model + ", Speed: " + speed + " GHz, Cores: " + cores + "]";
    }
}

// Класс Memory (Память)
class Memory {
    private String type; // Тип памяти (например, DDR4)
    private int size; // Размер в ГБ

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    // Геттеры
    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Memory [Type: " + type + ", Size: " + size + " GB]";
    }
}

// Класс Monitor (Монитор)
class Monitor {
    private double size; // Размер в дюймах
    private String resolution; // Разрешение экрана

    public Monitor(double size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    // Геттеры
    public double getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Monitor [Size: " + size + " inches, Resolution: " + resolution + "]";
    }
}

// Класс Computer (Компьютер)
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Геттеры
    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Computer [Brand: " + brand + ", " + processor + ", " + memory + ", " + monitor + "]";
    }
}
