package ru.mirea.task11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String firstName;
    private String lastName;
    private Date birthDate; // Дата рождения

    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Метод для форматирования даты рождения
    public String formatBirthDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Дата рождения=" + formatBirthDate("dd-MM-yyyy") +
                '}';
    }

    public static void main(String[] args) {
        // Пример работы
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date birthDate = dateFormat.parse("15-04-2000");

            Student student = new Student("Иван", "Иванов", birthDate);
            System.out.println(student);

            System.out.println("Краткий формат: " + student.formatBirthDate("dd-MM-yyyy"));
            System.out.println("Средний формат: " + student.formatBirthDate("MMMM dd, yyyy"));
            System.out.println("Полный формат: " + student.formatBirthDate("EEEE, MMMM dd, yyyy"));
        } catch (ParseException e) {
            System.out.println("Ошибка в формате даты!");
        }
    }
}
