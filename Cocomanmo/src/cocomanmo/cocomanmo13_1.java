package cocomanmo;

public class cocomanmo13_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		//2,4,6,8,10
		solution(x,n);
	}
	/* x��ŭ ������ �ִ� n���� ���� 
	 * 
	 * �Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, 
	 * x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
	 * ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	 * 
	 * x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	 * n�� 1000 ������ �ڿ����Դϴ�.
	 */
	
	
	public static long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        
        for(int i= 0; i<n; i++) {
        	answer[i] = (long)((i+1)*x);
        }
        return answer;
    }
}
