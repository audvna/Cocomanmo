package cocomanmo;

public class cocomanmo2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pPyYyoold";
		solution(s);
	}

	/*
	 *
	���� : ���ڿ� �� p�� y�� ����
	-
	ä�� ���
	��Ȯ��: 100.0
	�հ�: 100.0 / 100.00
	 * 
	 */
	static boolean solution(String s) {
        boolean answer = true;
        
        String[] us = s.toUpperCase().split("");
        int pCnt=0;
        int yCnt=0;
       
        for(int i=0; i<us.length; i++) {
        	if(us[i].equals("P")) {
        		pCnt++;
        	} else if(us[i].equals("Y")) {
        		yCnt++;
        	}
        }
        if(pCnt!=yCnt) {
        	answer = false;
        }
        return answer;
        
        
    /*
         �ٸ� ��� ���
    array�����ʰ� ���ڸ� �ѱ��ھ��� �����ͼ� ��
 	�ӵ�����... ���� ��� ����..    
         s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
      */
    }
}
