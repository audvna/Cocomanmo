package cocomanmo;

import java.util.HashMap;

public class cocomanmo7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(solution(participant,completion));
	}
	
	
/*
 * ���� : ������������ ����
����
������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
 */

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
 
        
        HashMap<String, Integer> hsParticipant = new HashMap<>();

        for(String part : participant) {
        	hsParticipant.put(part, (hsParticipant.containsKey(part)? hsParticipant.get(part)+1 : 1 ));
        }

        for(int i=0; i<completion.length; i++) {
	        if(hsParticipant.containsKey(completion[i])) {
	        	hsParticipant.put(completion[i], hsParticipant.get(completion[i]) - 1);
	        }
        }

        for(int i=0; i<participant.length; i++) {
        	if(hsParticipant.get(participant[i])>0) {
        		answer = participant[i];
        		break;
        	}
        }

        return answer;
    }
	
	
}
