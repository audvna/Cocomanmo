package cocomanmo;

public class cocomanmo2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane", "Kim", "Lee"};
		solution(seoul);
		System.out.println(solution(seoul));
	}
	
	/*
	 *
	���� : ���￡�� �輭�� ã��
	-
	ä�� ���
	��Ȯ��: 100.0
	�հ�: 100.0 / 100.0
	 * 
	 */
	public static String solution(String[] seoul) {
		String answer = "";
		int num=0;

		while(num<seoul.length) {
			if(seoul[num].equals("Kim")) {
				break;
			} else {
				num++;
			}
		}
		answer="�輭���� "+num+"�� �ִ�";
		return answer;
	}
}

	/*
        String answer = "";
        int num=1001;
      	
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		num=i;
        		break;
        	}
        }
        answer = "�輭���� "+num+"�� �ִ�";
        return answer;
    }*/


