import java.util.ArrayList;

public class Homework2 {
    public static void getSimleNumbers(int first, int last){

        ArrayList<Integer> simpleNumbers = new ArrayList<>();

        int mark;
        System.out.println("Простые числа от " + first + " до " + last);
        for (int i = first; i <= last; i++){
            mark = 0;
            for(int j = 2; j < i; j++) {
                if (i % j == 0 && mark == 0) {
                    mark++;
                }
            }
            if (mark == 0) {
                System.out.print(i + " ");
                simpleNumbers.add(i);
            }

        }
        System.out.println("\nИщем счасливое простое число....");
        System.out.println("Так вот же оно: " + simpleNumbers.get(5) + "!!!");
    }
}
