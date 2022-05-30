public class homeWork2 {
    public static void main(String[] args) {
        /*Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
          true если number1 делится на number2 без остатка. Аналогично первой задаче
          реализовать метод печати результата.*/
        int number1 = 75;
        int number2 = 22;
        printCheckResultMessage(number1, number2, isDivisible(number1, number2));
    }

    public static boolean isDivisible(int number1, int number2) {
        return (number2 != 0 && number1 % number2 == 0);
    }

    public static void printCheckResultMessage(int number1, int number2, boolean result) {
        if (result) {
            System.out.println(number1 + " делится на " + number2);
        } else {
            System.out.println(number1 + " не делится на " + number2);
        }
    }
}
