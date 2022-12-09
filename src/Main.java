/*Потрібно: Створити клас Printer.
У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику відповідного методу їх екземпляра,
рядки, передані як аргументи методів, виводилися різними кольорами. Обязательно используйте приведення типів.
 */

public class Main {
    public static void main(String[] args) {
        Printer empty = new Printer();
        empty.print("Скажи мені два слова");

        Printer blue = new Glory ();
        blue.print("Слава");

        Printer yellow = new Ukraine();
        Ukraine yellowDwn = (Ukraine) yellow;
        yellowDwn.print("Україні");



    }
}
