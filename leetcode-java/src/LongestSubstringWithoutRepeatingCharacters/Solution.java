package LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

public class Solution {
	
    public int lengthOfLongestSubstring(String s) {
    	if (s.length() == 0) {
			return 0;
		}
    	int minIndex = 0;
    	int maxIndex = 0;
    	int maxLen = 0;
    	int [] reflecttable = new int[256];
    	Arrays.fill(reflecttable, -1);
    	//System.out.println(reflecttable[2]);
    	int index = 0;
    	int tmplen = 0;
        for (int i = 0; i < s.length(); i++) {
        	//not exist 不重复
        	char ch = s.charAt(i);
        	index = s.charAt(i) - 0;
        	if (reflecttable[index] == -1) {
				reflecttable[index] = i;
				maxIndex = i;
				tmplen = maxIndex - minIndex + 1;
        		if (maxLen < tmplen) {
        			maxLen = tmplen;
        		}
			}
        	//exist 重复
        	else {
        		//produce maxIndex
        		maxIndex++;
        		//produce minIndex, minIndex会回退
        		if (reflecttable[index] < minIndex) {
					//continue;
				}
        		else {
        			minIndex = reflecttable[index] + 1;
				}
        		tmplen = maxIndex - minIndex + 1;
        		if (maxLen < tmplen) {
        			maxLen = tmplen;
        		}
				reflecttable[index] = i;
			}
		}
        return maxLen > (maxIndex - minIndex + 1) ? maxLen : (maxIndex - minIndex + 1);
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	System.out.println(solution.lengthOfLongestSubstring("tmmzuxt"));
    	System.out.println(solution.lengthOfLongestSubstring("qnfenpqdq"));
    	System.out.println(solution.lengthOfLongestSubstring("cdd"));
		System.out.println("success");
	}
}