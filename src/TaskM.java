
import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = a - 1; i < (a + b) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[a + b - 2 - i];
            arr[a + b - 2 - i] = temp;
        }

        for (int i = c - 1; i < (c + d) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[c + d - 2 - i];
            arr[c + d - 2 - i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
