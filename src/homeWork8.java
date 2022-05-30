public class homeWork8 {
    /*Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
     находится в диапазоне (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
     сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
     Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
     Число 13 не входит. )*/
    public static void main(String[] args) {
        int start = 10;
        int digit = 3;
        int finish = 15;
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (isNotNumberEnding(i, digit)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isNotNumberEnding(int num1, int digit) {

        return num1 % 10 != digit;
    }
}
