public class homeWork7 {
    /*Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
      всех чисел от start до finish включительно.
      Например: sum(10,15) -> 75*/
    public static void main(String[] args) {
        int finish = 15;
        int sum = 0;
        for (int start = 10; start <= finish; start++) {
            sum = sum + start;

        }
        System.out.println(sum);
    }


}








