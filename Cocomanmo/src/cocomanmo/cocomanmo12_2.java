package cocomanmo;

public class cocomanmo12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "-1234";
		solution(s);
		System.out.println(solution(s));
	}

	/*
	 ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

	���� ����
	s�� ���̴� 1 �̻� 5�����Դϴ�.
	s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
	s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
	s�� 0���� �������� �ʽ��ϴ�.
	 */
	 public static int solution(String s) {
	        int answer = 0;
	        answer = Integer.parseInt(s);
	        return answer;
    }
}
