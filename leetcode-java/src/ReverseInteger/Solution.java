package ReverseInteger;

public class Solution {

    public int reverse(int x) {
    	long result = x;
    	long tmp = 0;
    	int max = 0x7fffffff;
    	int min = 0x80000000;
    	System.out.println(min);
    	do {
			tmp = tmp*10 + result%10;
			result /= 10;
			if (tmp < min || tmp > max) {
				return 0;
			}
		} while (result != 0);
        return (int) tmp;
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		System.out.println(solution.reverse(-1));
	}
}