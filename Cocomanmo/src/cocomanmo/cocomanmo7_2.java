package cocomanmo;

public class cocomanmo7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= -1;
		int b= 5;
		System.out.println(solution(a, b));
	}
	
	/*
	���� : �� ���� ������ ��
	
	 ���� ����
	�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
	
	���� ����
	a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
	a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
	a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
	 */
	
	public static long solution(int a, int b) {
        long answer = 0;

        if(a>b) {
        	int temp = a;
        	a = b;
        	b = temp;
        }
        
        long cnt = b-a+1; 
        answer = cnt*(a+b)/2;
        
    /*   
        for(int i=a; i<=b; i++) {
        	answer += i;
        } 
     */
        return answer;
    }
}
