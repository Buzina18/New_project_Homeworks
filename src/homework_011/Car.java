package homework_011;

import java.util.List;
import java.util.stream.Collectors;

// Класс Автомобиль
class Car {
    private String number;
    private String model;
    private String color;
    private long mileage;
    private long cost;

    public Car(String number, String model, String color, long mileage, long cost) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.cost = cost;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public long getMileage() {
        return mileage;
    }

    public long getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%-7s %-7s %-6s %-7d %d", number, model, color, mileage, cost);
    }

    // Метод для проверки по цвету или пробегу
    public boolean matchesColorOrMileage(String color, long mileage) {
        return this.color.equals(color) || this.mileage == mileage;
    }
}