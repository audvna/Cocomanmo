package cocomanmo;

public class cocomanmo4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strings = { "abce", "abcd", "cdx" }; 
		String[] ne = solution(strings, 2);
		for(int i=0; i<ne.length; i++) {
		System.out.println(ne[i]);
		}
	}

	/*
	 *
	���� : ���ڿ� �� ������� �����ϱ�
	-
	ä�� ���(9)
	��Ȯ��: 100.0
	�հ�: 100.0 / 100.0
	 * 
	 */
	// .charAt�� �̿��ؼ� Ǯ�ٰ� �ٸ� ������� �ٲ� > ���߿� �� Ǯ����߰ڴ�.
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		int size = strings.length;
		answer = new String[size];

		for (int i = 0; i < size; i++) {
			answer[i] = strings[i];
		}

		for (int i = 0; i < size; i++) {
			boolean stop = false;
			for (int j = 0; j < size - i - 1; j++) {
				char s1 = answer[j].charAt(n);
				char s2 = answer[j + 1].charAt(n);
				if (s1 >= s2) {
					if (s1 == s2 && answer[j].compareTo(answer[j + 1]) < 0) {
					} else {
						String temp = answer[j];
						answer[j] = answer[j + 1];
						answer[j + 1] = temp;
						stop = true;
					}
				}
			}
			if (!stop)
				break;

		}

		return answer;
	}
}
