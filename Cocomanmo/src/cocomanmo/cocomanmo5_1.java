package cocomanmo;

public class cocomanmo5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 987654321;  //45
		System.out.println(solution(n));
		
	}
	/*
	���� : �ڸ��� ���ϱ�
	 �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
	������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

	���ѻ���
	N�� ���� : 100,000,000 ������ �ڿ��� 
	 */
	
	/*
	 -
	 ä�� ���(2)
	 ��Ȯ��: 100.0
	 �հ�: 100.0 / 100.0
	 */
	public static int solution(int n) {
		int answer = 0;
		String lenStr = Integer.toString(n);
		int len = lenStr.length();
		
		for(int i=len-1; i>=0; i--) {
			int cnt=1;
			cnt = (int) Math.pow(10, i);	
			answer += (int)(n/cnt);		
			n= n-((int)(n/cnt)*cnt);
			
			
		}
		return answer;

	}
	// 1�� �ڸ����� ����ϰ� �;��µ� ����� ���������ʾƼ� ���� ū �ڸ����� �������. 
	// �� ������ string���� ��ȯ�ؼ� �ڸ����� �޴� ������ ��ħ �̤�
	// %�� �غôµ� ���� �� �������ϰ� �������� Ȱ���� ������ ���ߴ�.
	// �ʹ� �ƽ���. ....
	
	
	/*
	 int answer = 0;
        while(n!=0){
            answer+=n%10;
            n=n/10;
        }
        return answer;
      */


}
