package cocomanmo;

public class cocomanmo8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "trY HELLO WORLD Oops AppLe OMG a ab abcde TRT ltl ";
		solution(s);

	}
	/*
	 * ���� : �̻��� ���� ����� ���� ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ�
	 * �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	 * 
	 * ���� ���� ���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�. ù ��° ���ڴ� 0��°
	 * �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
	 */

	public static String solution(String s) {

		String answer= "";
		int cnt=0;
		
		for(int i=0; i<s.length(); i++) {
			char eq = s.charAt(i);
			
			if (eq == ' ') {
				answer += String.valueOf(eq);
				cnt=0;
			} else {
				answer += (cnt++%2==0 ? String.valueOf(eq).toUpperCase() : String.valueOf(eq).toLowerCase());
			}
		}
		

		
		/*
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			char eq = s.charAt(i);

			if (eq == ' ') {
				answer += String.valueOf(eq);
				cnt = 0;
			} else if(eq != ' '){
				if (cnt % 2 == 0) {
					answer += String.valueOf(eq).toUpperCase();
				} else if (cnt % 2 == 1) {
					answer += String.valueOf(eq).toLowerCase();
				}
				cnt++;
			}
		}*/
		return answer;
	}

}
