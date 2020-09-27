package cocomanmo;

public class cocomanmo11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a B z";
		int n = 4;
		
		System.out.println(solution(s, n));
	}

	/*
	���� : ������ȣ
	
	� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. ���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
	
	���� ����
	������ �ƹ��� �о �����Դϴ�.
	s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
	s�� ���̴� 8000�����Դϴ�.
	n�� 1 �̻�, 25������ �ڿ����Դϴ�.
	 */
	
	
	public static String solution(String s, int n) {
        String answer = "";
        
        
        for(int i=0; i<s.length(); i++) {
        	char chResult = s.charAt(i);
        	
        	if(chResult>=65 && chResult<=90) { //�빮��
        		answer += (char)((chResult + n%26 -65)%26+65); 
        	} else if(chResult>=97 && chResult<=122) { //�ҹ���
        		//System.out.println(chResult);
        		answer += (char)((chResult + n%26 -97)%26+97); // �ٽ� a�� ���ư�����  
        	} else {
        		answer += (char)chResult;
        	}
        }
        
        return answer;
    }
}
