public class homeWork1 {
    public static void main(String[] args) {
        /*Реализовать метод boolean isEven(int number) который возвращает true если переданное
          число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int number, boolean result)
          который выводит на экран строку вида «10 это четное число» или “15 это не четное число»
          Подсказка: Используем конструкцию if и оператор % modulo*/
        System.out.println(isEven(10));
        System.out.println(isEven(15));
        int num1 = 244;
        int num2 = 235;
        printCheckResultMessage(num1, isEven(num1));
        printCheckResultMessage(num2, isEven(num2));
    }

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static void printCheckResultMessage(int number, boolean result) {
        if (result) {
            System.out.println(number + " - это четное число ");
        } else {
            System.out.println(number + " - это не четное число ");
        }
    }
}
