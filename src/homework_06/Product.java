package homework_06;

public class Product {
    private String name;
    private double price;

    // Конструктор
    public Product(String name, double price) {
        setName(name); // Устанавливаем название с проверкой
        setPrice(price); // Устанавливаем стоимость с проверкой
    }

    // Геттер для названия
    public String getName() {
        return name;
    }

    // Сеттер для названия с проверкой
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название продукта не может быть пустой строкой.");
        }
        this.name = name;
    }

    // Геттер для стоимости
    public double getPrice() {
        return price;
    }

    // Сеттер для стоимости с проверкой
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Стоимость продукта не может быть отрицательной.");
        }
        this.price = price;
    }

    // Переопределение метода toString для вывода информации о продукте
    @Override
    public String toString() {
        return "Продукт: " + name + ", Стоимость: " + price;
    }

    // Пример использования
    public static void main(String[] args) {
        try {
            Product product1 = new Product("Яблоко", 50.0);
            System.out.println(product1);

            Product product2 = new Product("", -10); // Выбросит исключение
            System.out.println(product2);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}