package RomantoInteger;

public class Solution {
	
    public int romanToInt(String s) {
    	if (s.length() == 0) {
			return 0;
		}
    	int ret = getInt(s.charAt(0));
    	for (int i = 1; i < s.length(); i++) {
			if (getInt(s.charAt(i-1)) < getInt(s.charAt(i))){
				//ret = (ret - getInt(s.charAt(i-1))) + getInt(s.charAt(i-1)) + getInt(s.charAt(i)) - 2*getInt(s.charAt(i-1));
				ret += getInt(s.charAt(i)) - 2*getInt(s.charAt(i-1));
			}
			else {
				ret += getInt(s.charAt(i));
			}
		}
		return ret;
    }
	
	private int getInt(char ch){
		switch (ch) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default : return 0;
		}
	}
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		System.out.println(solution.romanToInt("DCXXI"));
	}
}