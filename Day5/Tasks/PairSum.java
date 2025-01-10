package Day5.Tasks;

import java.util.Scanner;

public class PairSum {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n =scan.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                nums[i] =scan.nextInt();
            }
            int target = scan.nextInt();
            scan.close();
    
            int[] result = findPair(nums, target);
    
            if (result.length == 0) {
                System.out.println("[]");
            } else {
                System.out.println("[" + result[0] + ", " + result[1] + "]");
            }
        }
    
        public static int[] findPair(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }
    