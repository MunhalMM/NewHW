public class homeWork13 {
    /*Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
      в [] Например: “Hello” -> [H][e][l][l][o]*/
    public static void main(String[] args) {
        String str = "Hello";
        char ch1 = '[';
        char ch2 = ']';
        System.out.println(newString(str, ch1, ch2));

    }

    public static String newString(String str, char ch1, char ch2) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            string = string + ch1 + str.charAt(i) + ch2;


        }
        return string;
    }
}
