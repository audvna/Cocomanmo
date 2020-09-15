package cocomanmo;

import java.util.ArrayList;

public class cocomanmo10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		// solution(n);
		System.out.println(solution(n));
	}

	/*
	 * ���� ���� 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
	 * 
	 * �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�. (1�� �Ҽ��� �ƴմϴ�.)
	 * 
	 * ���� ���� n�� 2�̻� 1000000������ �ڿ����Դϴ�.
	 */


	public static int solution(int n) {
		//����� �ڵ�
		
		// �Ҽ��� �迭�� �ִ� �� �ƴ϶�, �־��� ���� �迭�� �־��� ��
        int answer = 0;
        int[] result = new int[n+1];
        
        for(int i=2; i<=n; i++) {
        	result[i]=i;
        }
        
        // �Ҽ��� ������ ����̶� ����ѵ�, ����� ����� ���� �ð��� ���� �� ���Ƽ� �غ�
        for(int i=2; i<=n; i++) {
        	for(int j=2*i; j<=n; j+=i) {
        		result[j]=0;
        	}
        }
        
        for(int i=0; i<=n; i++) {
        	if(result[i]!=0) {
        		answer++;
        	}
        }
        
        
        //��Ȯ���� �����ε�, ȿ���� �������
        /*
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int j=2; j<=n; j++) { 	
    	boolean trFl=true;
        	int cnt = result.size();
        	
        	//�Ҽ��� �������� �� ���� �Ҽ��� �ƴ�
        	for(int i=0; i<cnt; i++) {
        		if(j% (result.get(i).intValue())==0) {
        			trFl = false;
        			break;
        		} 
        	}
        	if(trFl) {
        		result.add(j);
        		answer++;
        	}
        }
        */
        
        return answer;
    }
}
