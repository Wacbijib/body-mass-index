public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        // Вес указывать в килограммах
        // Рост указвать в сантимерах

        int index = service.calculate(98, 187);
        System.out.println("Ваш индекс массы тела (ИМТ) равен: " + index);
        System.out.println();


    }

}
