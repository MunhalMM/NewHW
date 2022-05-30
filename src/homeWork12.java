public class homeWork12 {
    /*Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
      символов начиная с конца одинаковые у обеих строк.*/
    public static void main(String[] args) {
        String str1 = "hello java";
        String str2 = "welcome to java";
        System.out.println(sameFromTheEndPrefix(str1, str2));
    }

    public static int sameFromTheEndPrefix(String string1, String string2) {
        int a = string1.length() - 1;
        int b = string2.length() - 1;
        int result = 0;
        while (a >= 0 && b >= 0 && string1.charAt(a) == string2.charAt(b)) {
            result++;
            a--;
            b--;

        }
        return result;
    }
}
