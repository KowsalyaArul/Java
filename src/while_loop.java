import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int value= 0;
        int sum = 0;
        while (value>= 0) {
            sum = sum + value;
            value =num.nextInt();
            System.out.println(sum);
        }
    }
}
