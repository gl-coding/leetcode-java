package model;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
    	int [] returnInt = new int[2];
    	Hashtable<Integer, Integer> hashMap = new Hashtable<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (hashMap.get(nums[i]) != null) {
    			hashMap.put(nums[i], i);
			}
			int tmp = target - nums[i];
			if (hashMap.get(tmp) != null) {
				returnInt[0] = i+1;
				returnInt[1] = hashMap.get(tmp)+1;
				return returnInt;
			}
		}
        return returnInt;
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		System.out.println("success");
	}
}