package ru.mirea.task10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Класс Student
class Student {
    private String firstName;  // Имя
    private String lastName;   // Фамилия
    private String major;      // Специальность
    private int year;          // Курс
    private String group;      // Группа
    private double gpa;        // Средний балл

    // Конструктор
    public Student(String firstName, String lastName, String major, int year, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
        this.gpa = gpa;
    }

    // Геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Метод для отображения информации о студенте
    @Override
    public String toString() {
        return "Student{" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Специальность='" + major + '\'' +
                ", Курс=" + year +
                ", Группа='" + group + '\'' +
                ", Средний балл=" + gpa +
                '}';
    }
}

// Класс SortingStudentsByGPA
public class SortingStudentsByGPA {
    private List<Student> students = new ArrayList<>();

    // Метод для заполнения списка студентов
    public void setArray(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    // Метод сортировки по среднему баллу с использованием Comparator и QuickSort
    public void quickSort(List<Student> list, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivotIndex = partition(list, low, high, comparator);
            quickSort(list, low, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, high, comparator);
        }
    }

    private int partition(List<Student> list, int low, int high, Comparator<Student> comparator) {
        Student pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) > 0) { // Убывающий порядок
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student> list, int i, int j) {
        Student temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Метод сортировки студентов по среднему баллу
    public void sortByGPA() {
        quickSort(students, 0, students.size() - 1, Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Основной метод
    public static void main(String[] args) {
        // Создание списка студентов
        List<Student> studentList = List.of(
                new Student("Никита", "Погромский", "Программирование", 2, "КВБО-05-23", 5.0),
                new Student("Анна", "Петрова", "Программирование", 1, "КВБО-05-23", 4.5),
                new Student("Сергей", "Сидоров", "Программирование", 3, "КВБО-05-23", 3.7),
                new Student("Мария", "Кузнецова", "Программирование", 4, "КВБО-05-23", 4.2)
        );

        // Создание экземпляра SortingStudentsByGPA
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(studentList);

        System.out.println("До сортировки:");
        sorter.outArray();

        // Сортировка по среднему баллу
        sorter.sortByGPA();

        System.out.println("\nПосле сортировки:");
        sorter.outArray();
    }
}