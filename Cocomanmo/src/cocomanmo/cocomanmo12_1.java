package cocomanmo;

import java.util.Arrays;
import java.util.Collections;

public class cocomanmo12_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String s = "Zbcdefg";
		//gfedcbZ
		//solution(s);
		System.out.println(solution(s));
	}
	
	
	/*
	 * ���ڿ� ������������ ��ġ�ϱ�
	 * 
	 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	   s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
	   str�� ���� 1 �̻��� ���ڿ��Դϴ�.
	 */
	public static String solution(String s) {
        String answer = "";
        
        Character [] chEqu = new Character [s.length()];
        
		for(int i=0; i<chEqu.length; i++) {
			chEqu[i] = s.charAt(i);
		}
		Arrays.sort(chEqu,Collections.reverseOrder());

		for(int i=0; i<chEqu.length; i++) {
			answer += chEqu[i];
		}
	
        return answer;
    }
}


