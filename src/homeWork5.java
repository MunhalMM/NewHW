public class homeWork5 {
    public static void main(String[] args) {
        /*Реализовать метод String longestString (String str1, String str2, String str2) который
          возвращает самую длинную строку из трех заданных строк:
          Подсказка: Используйте метод, написанный в пункте 4
          Например: longestString (“java”,”welcome”,”hello”) -> “welcome”*/
        String str1 = "I love Java";
        String str2 = "welcome";
        String str3 = "hello";
        System.out.println(longestString(str1, str2, str3));
    }

    public static String longestString(String str1, String str2, String str3) {
        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            return str1;
        } else if (str2.length() > str3.length()) {
            return str2;
        } else {
            return str3;
        }

    }
}


