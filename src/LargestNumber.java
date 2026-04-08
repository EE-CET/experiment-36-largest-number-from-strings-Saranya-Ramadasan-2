import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        String[] nums = new String[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.next();
        }
        
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        
        if (nums[0].equals("0")) {
            System.out.println("0");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : nums) {
            sb.append(s);
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}