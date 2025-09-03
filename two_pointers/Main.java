import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter your numbers");
        String[] input = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (arr.length == 0) {
            System.out.println("Empty array");
            return;
        }

        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int[] result = Arrays.copyOfRange(arr, 0, j + 1);
        System.out.println(Arrays.toString(result));
    }
}
  
