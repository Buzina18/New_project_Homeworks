package homework_011;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создаем список автомобилей
        List<Car> cars = List.of(
                new Car("a123me", "Mercedes", "White", 0, 8300000),
                new Car("b873of", "Volga", "Black", 0, 673000),
                new Car("w487mn", "Lexus", "Grey", 76000, 900000),
                new Car("p987hj", "Volga", "Red", 610, 704340),
                new Car("c987ss", "Toyota", "White", 254000, 761000),
                new Car("o983op", "Toyota", "Black", 698000, 740000),
                new Car("p146op", "BMW", "White", 271000, 850000),
                new Car("u893ii", "Toyota", "Purple", 210900, 440000),
                new Car("l097df", "Toyota", "Black", 108000, 780000),
                new Car("y876wd", "Toyota", "Black", 160000, 1000000)
        );

        // Выводим список автомобилей
        System.out.println("Автомобили в базе:");
        System.out.println("Number Model   Color  Mileage Cost");
        cars.forEach(System.out::println);

        // Номера автомобилей по цвету или пробегу
        String colorToFind = "Black";
        long mileageToFind = 0L;
        List<String> filteredNumbers = cars.stream()
                .filter(car -> car.matchesColorOrMileage(colorToFind, mileageToFind))
                .map(Car::getNumber)
                .collect(Collectors.toList());
        System.out.println("\nНомера автомобилей по цвету или пробегу: " + String.join(" ", filteredNumbers));

        // Цвет автомобиля с минимальной стоимостью
        String minCostColor = cars.stream()
                .min((c1, c2) -> Long.compare(c1.getCost(), c2.getCost()))
                .map(Car::getColor)
                .orElse("Не найден");
        System.out.println("Цвет автомобиля с минимальной стоимостью: " + minCostColor);
    }
}