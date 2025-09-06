package homework_08;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        // Удаляем пробелы и приводим строки к нижнему регистру
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        // Если длины строк разные, они не могут быть анаграммами
        if (s.length() != t.length()) {
            return false;
        }

        // Сортируем символы строк и сравниваем их
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String s = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String t = scanner.nextLine();

        System.out.println("Результат: " + isAnagram(s, t));
    }
}
