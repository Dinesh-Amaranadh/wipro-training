package Day5.Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ZeroSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int n =scan.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                nums[i] =scan.nextInt();
            }
            scan.close();
        

        List<int[]> result = findZeroSumSubarrays(nums);

        if (result.isEmpty()) {
            System.out.println("[]");
        } else {
            for (int[] subarray : result) {
                System.out.println("[" + subarray[0] + ", " + subarray[1] + "]");
            }
        }
    }

    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        List<int[]> subarrays = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1); // To handle subarrays starting from index 0

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    subarrays.add(new int[]{start + 1, i});
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return subarrays;
    }
}
