package cocomanmo;

import java.util.ArrayList;

public class cocomanmo4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers= {1,3,2,4,2};
	//	int[] answers= {1,2,3,4,5};
		
		int[] z = solution(answers);
		for(int i=0; i< z.length; i++) {
			
			System.out.println(solution(answers)[i]);
		}
	}
	
	/*
	�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

	1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ... 
	2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

	1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

	���� ����
	������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
	������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
	���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
	 */
	
	
	/*
	 ���� : ���ǰ��
	 -
	 ä�� ���(6)
	 ��Ȯ��: 100.0
	 �հ�: 100.0 / 100.0
	 */
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int size = answers.length;
        int[] math1 = new int[size];
        int[] math2 = new int[size];
        int[] math3 = new int[size];
        
        int[] repeat = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
    
        int cnt=1;
        int cnt2 = 1;
       
        for(int i=0; i<size; i++) {
	
        	//math1
        	math1[i]= cnt;
        
        	//math2
        	if(i%2==0) { 
        	math2[i]= 2;
        	} else {
        		math2[i]=cnt2;
        		cnt2++;
        		if(cnt2==2) {
        			cnt2++;
        		} else if(cnt2>5) {
        			cnt2=1;
        		}
        	}
        
        
        	//math3
        	if(i>9) {
        		math3[i] = repeat[i%10];
        	} else {
        		math3[i] = repeat[i];
        	}
        
        	
        	if(cnt>=5) {
        		cnt=1;
        	} else {
        		cnt++;        		
        	}
     
        
        }
        

        answer = new int[3];

    	for(int j=0; j<size; j++) {
    		if(math1[j] == answers[j]) {
    			answer[0]++;
    		}
    		
    		if(math2[j] == answers[j]) { 
    			answer[1]++;
    		}
    		
    		if(math3[j] == answers[j]) { 
    			answer[2]++;
    		}
    	}
    	
    	
    	ArrayList<Integer> result = new ArrayList<>();

    	int total =  Math.max(Math.max(answer[0], answer[1]), answer[2]);
    	



    	if(answer[0]==total) {
    		result.add(1);
    	}
    	
    	if(answer[1]==total) {
    		result.add(2);
    	}
    	if(answer[2]==total) {
    		result.add(3);
    	}
    	
    	
    	
    	int[] tt = new int[result.size()];
    
    	int temp = 0;
    	for(Integer num : result){
    		tt[temp++] = num;
 
        }
    	
    	 
        return tt;
    }
	
}
