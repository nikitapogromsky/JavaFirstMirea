package ru.mirea.task15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelector {
    public static void main(String[] args) {
        // Создаем окно
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Создаем метку для отображения информации
        JLabel label = new JLabel("Выберите страну", SwingConstants.CENTER);

        // Создаем выпадающий список (JComboBox)
        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> countryBox = new JComboBox<>(countries);

        // Обработчик событий для JComboBox
        countryBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryBox.getSelectedItem();
                switch (selectedCountry) {
                    case "Australia":
                        label.setText("Capital: Canberra");
                        break;
                    case "China":
                        label.setText("Capital: Beijing");
                        break;
                    case "England":
                        label.setText("Capital: London");
                        break;
                    case "Russia":
                        label.setText("Capital: Moscow");
                        break;
                }
            }
        });

        // Добавляем элементы в окно
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(countryBox);
        frame.add(label);

        // Отображаем окно
        frame.setVisible(true);
    }
}
