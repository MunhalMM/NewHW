public class homeWork9 {
    /*Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
      позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
      возвращаем -1.
      Например: find(“let’s talk about java”,’t’) -> 2*/
    public static void main(String[] args) {
        String str = "let’s talk about java";
        char ch = 't';
        System.out.println(str.indexOf(ch));
        System.out.println(findFirstCharIndex(str, ch));

    }

    public static int findFirstCharIndex(String str, char ch) {
        int i = str.length();
        int result = -1;
        for (int j = 0; j < i; j++) {
            if (str.charAt(j) == ch) {
                result = j;
                break;
            }

        }
        return result;
    }


}

