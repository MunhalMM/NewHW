public class homeWork11 {
    /*Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
    символов начиная с начала одинаковые у обеих строк.*/
    public static void main(String[] args) {
        String str1 = "i like java";
        String str2 = "i like my job";
        System.out.println(sameFromTheBeginningPrefix(str1, str2));

    }

    public static int sameFromTheBeginningPrefix(String string1, String string2) {
        int j = 0;
        int i1 = 0;
        int i2 = 0;
        while (i1 <= string1.length() && i2 <= string2.length() && string1.charAt(i1) == string2.charAt(i2)) {
            j++;
            i1++;
            i2++;

        }
        return j;
    }
}
