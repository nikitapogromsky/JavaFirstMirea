package ru.mirea.task2;

import java.util.Scanner;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
    public static void main(String[] args) {
        String email;
        Author a1= new Author("Пушкин А С", "puskinas@gmail.com", 'M');
        Author a2= new Author("Гоголь Н В", "gogolnv@gmail.com", 'M');
        System.out.println(a1.getName());
        System.out.println(a2.getEmail());
        System.out.println(a1.getGender());
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
        a1.setEmail(email);
        System.out.println(a1.toString());

    }

}