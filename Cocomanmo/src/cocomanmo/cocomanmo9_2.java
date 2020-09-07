package cocomanmo;

public class cocomanmo9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};
		System.out.println(solution(n, lost, reserve));
	}

	
	
	/*
	���� : ü����
	 ���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. 
	 ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. 
	 �л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
	 ���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. 
	 ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.

	��ü �л��� �� n, 
	ü������ �������� �л����� ��ȣ�� ��� �迭 lost, 
	������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, 
	ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

	���ѻ���
	��ü �л��� ���� 2�� �̻� 30�� �����Դϴ�.
	ü������ �������� �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
	������ ü������ ������ �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
	���� ü������ �ִ� �л��� �ٸ� �л����� ü������ ������ �� �ֽ��ϴ�.
	���� ü������ ������ �л��� ü������ ���������� �� �ֽ��ϴ�. �̶� �� �л��� ü������ �ϳ��� �������ߴٰ� �����ϸ�, ���� ü������ �ϳ��̱⿡ �ٸ� �л����Դ� ü������ ������ �� �����ϴ�.
	 */

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int people = 0;
		int resPeople=0;

		int lostCnt = lost.length;
		int reserveCnt = reserve.length;

	       for(int i=0; i<lostCnt; i++) {
	    	   for(int j=0; j<reserveCnt; j++) {
	    		   if(lost[i]==reserve[j]) {
	    			   lost[i]=32;
	    			   reserve[j]=32;
	    			   resPeople++;
	    			   break;
	    		   }
	    	   }
	       }
	  
	       for(int i=0; i<lostCnt; i++) {
	    	   for(int j=0; j<reserveCnt; j++) {
	    		 
	    		   if(lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1) {
	    			   people++;
	    			   reserve[j]=-1;
	    			   break;
	    		   }
	    	   }
	       }
	       
	
		
		answer = n - lostCnt +resPeople + people ;
		return answer;
	}
}
