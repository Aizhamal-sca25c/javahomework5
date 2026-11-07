
import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; ) {
            int j = i;

            while (j < n && arr[i] == arr[j]) {
                j++;
            }

            if (j - i >= 3) {
                count += j - i;
            }

            i = j;
        }

        System.out.println(count);
    }
}
