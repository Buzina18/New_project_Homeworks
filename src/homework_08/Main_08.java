package homework_08;

import java.util.HashSet;
import java.util.Set;

public class Main_08 {
    public static void main(String[] args) {
        PowerfulSet powerfulSet = new PowerfulSet();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        set2.add(4);

        // Пересечение
        Set<Integer> intersection = powerfulSet.intersection(set1, set2);
        System.out.println("Пересечение: " + intersection);

        // Объединение
        Set<Integer> union = powerfulSet.union(set1, set2);
        System.out.println("Объединение: " + union);

        // Относительное дополнение
        Set<Integer> relativeComplement = powerfulSet.relativeComplement(set1, set2);
        System.out.println("Относительное дополнение: " + relativeComplement);
    }
}
