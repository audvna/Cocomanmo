package cocomanmo;

public class cocomanmo13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1,2,3,4};
		int[] arr= {5,5};
		System.out.println(solution(arr));
		//2.5
	}
	
	/* ��� ���ϱ�
	 * 
	 * ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
	 * 
	 * arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
	 * arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
	 */
	
	public static double solution(int[] arr) {
        double answer = 0;
        
        for(int i=0; i<arr.length; i++) {
        	answer += arr[i];
        	System.out.println(answer);
        }
        answer = answer/arr.length;
        return answer;
    }
}
