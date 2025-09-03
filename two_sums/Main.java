import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6, 7, 11, 15};
	Scanner sc = new Scanner(System.in);	
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("no number");
	}
    }
}		
