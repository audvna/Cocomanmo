package cocomanmo;

import java.util.ArrayList;
import java.util.Collections;

public class cocomanmo6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12; //28
		System.out.println(solution(n));
		

	}
	/*
	 * ���� : ����� �� ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	 * 
	 * ���� ���� n�� 0 �̻� 3000������ �����Դϴ�.
	 */

	/*
	 ä�����(3) :
	 ��Ȯ��: 100.0
	 �հ�: 100.0 / 100.0
	 */

	public static int solution(int n) {
		
		int answer = 0;
		int num = (int) (n/2)+1;
	
		for (int i = 1; i <= num; i++) {
			
			if (n % i == 0) {
				if(i<(n/i)) {
					answer += (i+ n/i);
				} else if((n/i)==i) {
					answer += i;
				}
			}
		}

		return answer; 
		
		// �ٸ����Ǯ��
		//���ݸ� ������ �Ǵ� �� �˾Ҵµ� n�� ���� ������ ���ߴ�
		//�������� �� �� �а� �����ؾ���
		 
		/*
		 int answer = 0;
         for(int i = 1; i <= n/2; i++){
        	 if(n%i == 0)  {
        		 answer += i;
        	 }
         }
     return answer+n; */
	}
}
