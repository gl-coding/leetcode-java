package PalindromeNumber;

public class Solution {

    public boolean isPalindrome(int x) {
        if(x < 0)
        	return false;
        int tmp = 0;
        int result = x;
        do {
			tmp = tmp*10 + result%10;
			result /= 10;
		} while (result != 0);
        return x == tmp;
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		System.out.println(solution.isPalindrome(12321));
	}
}