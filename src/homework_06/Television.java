package homework_06;

public class Television {

    private String марка;
    private int диагональ;
    private boolean включен;
    private int громкость;
    private int канал;

    public Television(String марка, int диагональ) {
        this.марка = марка;
        this.диагональ = диагональ;
        this.включен = false;
        this.громкость = 50;
        this.канал = 1;
    }

    public void включить(){
        if (!включен){
            включен = true;
            System.out.println("Телевизор включен.");
        } else {
            System.out.println("Телевизор уже включен.");
        }
    }

    public void выключить(){
        if (включен){
            включен = false;
            System.out.println("Телевизор выключен.");
        } else {
            System.out.println("Телевизор уже выключен.");
        }
    }

    public void увеличитьГромкость() {
        if (включен && громкость < 100) {
            громкость++;
            System.out.println("Громкость увеличена до " + громкость);
        } else if (!включен) {
            System.out.println("Телевизор выключен, нельзя изменить громкость.");
        } else {
            System.out.println("Громкость уже на максимуме.");
        }
    }

    public void переключитьКанал(int новыйКанал) {
        if (включен) {
            if (новыйКанал >= 1 && новыйКанал <= 100) {
                канал = новыйКанал;
                System.out.println("Канал переключен на " + канал);
            } else {
                System.out.println("Канал должен быть в диапазоне от 1 до 100.");
            }
        } else {
            System.out.println("Телевизор выключен, нельзя переключить канал.");
        }
    }

    public void показатьИнформацию() {
        System.out.println("Марка: " + марка);
        System.out.println("Диагональ: " + диагональ + " дюймов");
        System.out.println("Состояние: " + (включен ? "Включен" : "Выключен"));
        System.out.println("Громкость: " + громкость);
        System.out.println("Канал: " + канал);
    }

    public static void main(String[] args) {
        Television television = new Television("Samsung",  55);
        television.показатьИнформацию();
        television.включить();
        television.переключитьКанал(5);
        television.увеличитьГромкость();
        television.показатьИнформацию();
        television.выключить();
    }
}
