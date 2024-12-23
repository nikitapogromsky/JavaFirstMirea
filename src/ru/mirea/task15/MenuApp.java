package ru.mirea.task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuApp {
    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Устанавливаем GridLayout для кнопок и текстового поля
        frame.setLayout(new BorderLayout());

        // Создаем текстовое поле
        JTextArea textArea = new JTextArea("This is the area you can write text.");
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создаем панель для кнопок
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Создаем строку меню
        JMenuBar menuBar = new JMenuBar();

        // Меню "Файл"
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        saveItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Save clicked"));
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Меню "Правка"
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem cutItem = new JMenuItem("Cut");

        copyItem.addActionListener(e -> textArea.copy());
        pasteItem.addActionListener(e -> textArea.paste());
        cutItem.addActionListener(e -> textArea.cut());

        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(cutItem);

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "This is a sample menu application."));
        helpMenu.add(aboutItem);

        // Добавляем меню в строку меню
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Устанавливаем строку меню
        frame.setJMenuBar(menuBar);

        // Обработчики для кнопок
        button1.addActionListener(e -> textArea.append("\nButton 1 clicked"));
        button2.addActionListener(e -> textArea.append("\nButton 2 clicked"));

        // Отображаем окно
        frame.setVisible(true);
    }
}
