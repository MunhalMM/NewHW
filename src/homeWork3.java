public class homeWork3 {
    public static void main(String[] args) {
        /*Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
          должен возвращать true если и первое и второе число делятся без остатка на третье.
          Подсказка: Используйте метод, написанный в пункте 2*/
        int number1 = 48;
        int number2 = 36;
        int number3 = 3 ;
        boolean res = isDivisible2Number(number1, number2, number3);
        printResult(number1, number2, number3, res);
    }

    public static boolean isDivisible2Number(int number1, int number2, int number3) {
        return isDivisible(number1, number3) && isDivisible(number2, number3);

    }

    public static boolean isDivisible(int number1, int number2) {

        return (number2 != 0 && number1 % number2 == 0);
    }

    public static void printResult(int number1, int number2, int number3, boolean result) {
        if (result) {
            System.out.println(number1 + " & " + number2 + " делятся на " + number3);
        } else {
            System.out.println(number1 + " & " + number2 + " не делятся на " + number3);
        }
    }
}
