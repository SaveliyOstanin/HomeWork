import java.util.ArrayList;
import java.util.Scanner;

public class DoubleChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer(sc.nextLine());

        ArrayList<Integer> index = new ArrayList<Integer>();

        for (int i = 1; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                char buf;
                for(int j = 0; j < i; j++){
                    if (text.charAt(j) != text.charAt(i)){
                        buf = text.charAt(j);
                        text.deleteCharAt(j);
                        text.insert(i, buf);
                        break;
                    }
                }
            }
            System.out.println("Промежуточный вариант: " + text);
        }
        System.out.println("Конечный вариант: " + text);
    }
}
