import org.w3c.dom.ls.LSOutput;

public class HomeWorkApp {

    public static void printThreeWords() {
        String[] strings = {"Orange", "Banana", "Apple"};
        for(String item:strings)
            System.out.println(item);
    }

    public static void checkSumSign() {
        int a = 13,b = -13;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная") ;
    }

    public static void printColor() {
        int value = 3;
        String[] colors = {"Красный","Желтый","Зеленый"};
        if(value <= 0) {
            System.out.println(colors[0]);
        }else if (value > 0 && value <= 100) {
            System.out.println(colors[1]);
        }else {
            System.out.println(colors[2]);
        }
    }

    public static void compareNumbers() {
        int a = 121,b = 14;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
