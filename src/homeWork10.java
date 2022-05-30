public class homeWork10 {
    /*Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
      позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
      нет, возвращаем -1.
      Например: find(“let’s talk about java”,’t’) -> 15*/
    public static void main(String[] args) {
        String str = "let's talk about java";
        char ch = 't';
        System.out.println(str.lastIndexOf(ch));
        System.out.println(findLastCharIndex(str, ch));
    }

    public static int findLastCharIndex(String str, char ch) {
        int i = str.length() - 1;
        int result = -1;
        for (int j = i; j >= 0; j--) {
            if (str.charAt(j) == ch) {
                result = j;
                break;
            }

        }
        return result;
    }
}
