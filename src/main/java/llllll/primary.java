package llllll;

import java.util.Scanner;

public class primary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ref r = new ref();
        int num = sc.nextInt();
        int result = r.run(num);

        System.out.println(result);
    }
}
