package ru.mirea.task26;

import java.util.regex.*;

public class Main {

    // Регулярное выражение для проверки IPv4-адресов в десятичном виде
    private static final String IPV4_REGEX = "((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)";

    // Регулярное выражение для проверки баланса скобок
    private static final String BALANCED_BRACKETS_REGEX = "^[^()]*\\(([^()]*\\([^()]*\\))*[^()]*\\)[^()]*$";

    public static void main(String[] args) {
        // Проверка IP-адресов
        System.out.println("Проверка IPv4-адресов:");
        String[] ipAddresses = {
                "127.0.0.1", "255.255.255.0", "1300.6.7.8", "abc.def.gha.bcd"
        };
        for (String ip : ipAddresses) {
            System.out.println("Адрес " + ip + " является допустимым? " + isValidIPv4(ip));
        }

        // Проверка сбалансированных скобок
        System.out.println("\nПроверка выражений на сбалансированность скобок:");
        String[] expressions = {
                "(3*+5)*−9*x*4", "((3*+5)*−9*x*4", "((3+5))", "(()())"
        };
        for (String expr : expressions) {
            System.out.println("Выражение \"" + expr + "\" является сбалансированным? " + hasBalancedBrackets(expr));
        }
    }

    // Метод для проверки корректности IPv4-адреса
    public static boolean isValidIPv4(String ip) {
        Pattern pattern = Pattern.compile(IPV4_REGEX);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    // Метод для проверки сбалансированности скобок
    public static boolean hasBalancedBrackets(String expression) {
        while (expression.contains("()")) {
            expression = expression.replace("()", "");
        }
        return !expression.contains("(") && !expression.contains(")");
    }
}