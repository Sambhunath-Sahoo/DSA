import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

    public static Integer majorityNumber(ArrayList<Integer> nums, Integer n) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer integer : nums) {
            if(hm.containsKey(integer)) {
                hm.put(integer, 1 + hm.get(integer));
            } else {
                hm.put(integer,1);
            }
        }

        for(Map.Entry<Integer, Integer> it: hm.entrySet()) {
            if(it.getValue() > n/2) {
                return it.getKey();
            }
        }
        return -1;
    }

    public static void swap(ArrayList<Integer> nums, Integer i, Integer j) {
        Integer temp = nums.get(i);
        nums.set(i, nums.get(j)); // replace instead of insert
        nums.set(j, temp);
    }

    public static void sort(ArrayList<Integer> nums, Integer n) {

        Integer left = 0;
        Integer mid = 0;
        Integer right = n-1;

        while (mid < right) {
            if (nums.get(mid) == 2) {
                swap(nums, mid, right);
                right--;
            } 
            else if (nums.get(mid) == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }

        // Integer answer = majorityNumber(nums, n);
        // System.out.println(answer);

        sort(nums, n);

        sc.close();
    }
}
