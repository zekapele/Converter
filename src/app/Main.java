package app;

public class Main {

    private static final double CONV_K = 2.20462; // Коефіцієнт для конвертації

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("app for measures converting");
        double kgs = 5; // Вага в кілограмах
        double pounds = convKgsToPounds(kgs);
        System.out.println("Result is " + pounds + " pounds.");
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }
}
