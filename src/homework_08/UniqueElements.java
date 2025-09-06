package homework_08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static <T> Set<T> getUniqueElements(ArrayList<T> list) {
        // HashSet автоматически удаляет дубликаты
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);

        Set<Integer> uniqueNumbers = getUniqueElements(numbers);
        System.out.println("Уникальные элементы: " + uniqueNumbers);
    }
}
