public class homeWork14 {
    /*Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
      заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
      Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”*/
    public static void main(String[] args) {
        String str = "Java is a very good program";
        System.out.println(str.substring(5,15));
        System.out.println(substring(str, 3, 18));
    }

    public static String substring(String str, int start, int finish) {
        String charSum = "";
        for (int i = start; i < finish; i++) {
            char ch = str.charAt(i);
            charSum = charSum + ch;

        }
        return charSum;
    }
}
