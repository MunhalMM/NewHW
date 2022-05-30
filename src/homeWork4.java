public class homeWork4 {
    public static void main(String[] args) {
        /*Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
          наибольшее из трех переданных чисел:
          Например: max3(10,19,0) -> 19*/
        int num1 = 94;
        int num2 = 234;
        int num3 = 46;
        System.out.println(max3(num1, num2, num3));
    }

    public static int max3(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
