public class homeWork6 {
    /*Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
      делятся на 4*/
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 4 != 0) {
                System.out.println(i);
            }

        }
    }
}
