public class homeWork15 {
    /*Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
      который вместо заданной строки с номером счета (например ”DE5128279087265”)
      возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
      засекреченных цифр)*/
    public static void main(String[] args) {
        String str = "DE5128279087265";
        char ch = '*';

        System.out.println(newString(str, ch));
    }

    public static String newString(String str, char ch) {
        String result = "";
        if (str.length() == 15) {
            for (int i = 0; i < str.length(); i++) {
                if (i > 3 && i < 13) {
                    result = result + ch;
                } else {
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }
}
