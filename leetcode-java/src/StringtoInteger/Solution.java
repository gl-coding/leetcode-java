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
        		//���ֺ�ĳ��ֿո�
        		if (intflag) {
					break;
				}
        		//����else
				continue;
			}
        	else if (tmp >= '0' && tmp <= '9') {
        		intflag = true;
        		//��һ�γ�ʼ��flag
        		if (flag == 0) {
					flag = 1;
				}
        		//��������֮ǰ��0
        		if (sum == 0 && tmp == '0') {
        			continue;
				}
        		tmpInt = tmp - '0';
        		sum = sum*10 + tmpInt;
        		//�Ƚϵ�ʱ��Ҫ��ӷ���
        		if (sum*flag < min) {
					return min;
				}
        		if (sum*flag > max) {
					return max;
				}
        		continue;
        	}
        	//�ظ�+-�Ĵ���
    		if (tmp == '+' || tmp == '-') {
    			if (flag != 0) {
					return 0;
				}
    			if (str.charAt(i+1) == ' ') {
					return 0;
				}
    			flag = (tmp == '+') ? 1 : -1;
    		}
    		//�����ַ��Ĵ���
    		else {
    			//����ֻ�ǵ��ַ�
    			if (intflag) {
					break;
				}
    			//����֮ǰ�����ַ�
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