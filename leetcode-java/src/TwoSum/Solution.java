package TwoSum;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Solution {
	
    public int[] twoSum(int[] nums, int target) {
    	int [] returnInt = new int[2];
    	Hashtable hashMap = new Hashtable();
    	for (int i = 0; i < nums.length; i++) {
			hashMap.put(new Integer(nums[i]), new Integer(i));
		}
    	Iterator iterator = hashMap.keySet().iterator();
    	while (iterator.hasNext()) {
			int other = target - (int)iterator.next();
		}
        return returnInt;
    }
    
    public static void main(String[] args) {
		System.out.println("success");
	}
}