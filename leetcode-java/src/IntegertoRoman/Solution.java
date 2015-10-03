package IntegertoRoman;

public class Solution {

	String [] strings = {"M",  "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	int []      value = {1000, 900,  500,   400, 100,   90,  50,   40,  10,    9,   5,    4,  1};
	String ret = "";
    public String intToRoman(int num) {
    	int flag = 0;
    	for (int i = flag; i < value.length; i++) {
			while (num >= value[i]) {
				num -= value[i];
				ret += strings[i];
			}
			flag++;
		}
        return ret;
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		System.out.println(solution.intToRoman(2900));
	}
}