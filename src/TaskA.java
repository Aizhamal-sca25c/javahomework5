import java.util.Scanner;


public class TaskA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[n];


        for(int i=0; i<n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < n; i += 2) {
            System.out.print(nums[i] + " ");
        }

    }
}
