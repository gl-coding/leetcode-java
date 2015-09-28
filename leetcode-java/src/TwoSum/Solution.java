package TwoSum;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
    	int [] returnInt = new int[2];
    	Hashtable<Integer, Integer> hashMap = new Hashtable<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
			int tmp = target - nums[i];
			if (hashMap.get(tmp) != null) {
				returnInt[0] = hashMap.get(tmp)+1;
				returnInt[1] = i+1;
				return returnInt;
			}
			if (hashMap.get(nums[i]) == null) {
				hashMap.put(nums[i], i);
			}
		}
        return returnInt;
    }
    
    public static void main(String[] args) {
    	int [] nums = {3,2,4};
    	Solution solution = new Solution();
    	int [] tmp = solution.twoSum(nums, 6);
    	System.out.println(tmp[1]);
		System.out.println("success");
	}
}