package StringtoInteger;

public class Solution {
	
    public int myAtoi(String str) {
    	int flag = 0;
    	int tmpInt = 0;
    	int min = 0x80000000;
    	int max = 0x7fffffff;
    	long sum = 0;
    	boolean intflag = false;
        for (int i = 0; i < str.length(); i++) {
        	char tmp = str.charAt(i);
        	if (tmp == ' ') {
        		//数字后的出现空格
        		if (intflag) {
					break;
				}
        		//隐含else
				continue;
			}
        	else if (tmp >= '0' && tmp <= '9') {
        		intflag = true;
        		//第一次初始化flag
        		if (flag == 0) {
					flag = 1;
				}
        		//处理数字之前的0
        		if (sum == 0 && tmp == '0') {
        			continue;
				}
        		tmpInt = tmp - '0';
        		sum = sum*10 + tmpInt;
        		//比较的时候要添加符号
        		if (sum*flag < min) {
					return min;
				}
        		if (sum*flag > max) {
					return max;
				}
        		continue;
        	}
        	//重复+-的处理
    		if (tmp == '+' || tmp == '-') {
    			if (flag != 0) {
					return 0;
				}
    			if (str.charAt(i+1) == ' ') {
					return 0;
				}
    			flag = (tmp == '+') ? 1 : -1;
    		}
    		//其他字符的处理
    		else {
    			//数字只是的字符
    			if (intflag) {
					break;
				}
    			//数字之前出现字符
				return 0;
			}
        }
        return (int) (sum*flag);
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
		System.out.println(solution.myAtoi("010"));
	}
}