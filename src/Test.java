
import java.io.BufferedInputStream;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        int [] numArray = new int[100];
        int sum = 0;
        int bigger = 0;
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n, m;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
            sum++;
        }
        m = scanner.nextInt();
        for (int i = 0; i < sum; i++) {
            if (m > numArray[i]) {
                bigger++;
            }
        }
        System.out.println("比它们小的数字个数是:");
        System.out.println(bigger);
    }
}