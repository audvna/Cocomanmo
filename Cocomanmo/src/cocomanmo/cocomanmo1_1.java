package cocomanmo;


import java.util.ArrayList;

public class cocomanmo1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 2, 3, 3, 2, 2 };
		solution(arr);

	}
/*
 *
���� : ���� ���ڴ� �Ⱦ�
-
ä�� ���
��Ȯ��: 71.9
ȿ����: 28.1
�հ�: 100.0 / 100.0
 * 
 */
	public static int[] solution(int []arr) {
        int[] answer = {};
        int len = arr.length;
        ArrayList<Integer> myA = new ArrayList<>();

        myA.add(arr[0]);
        
        for(int i=0; i<len-1; i++) {
        	if(arr[i] != arr[i+1]) {
        		myA.add(arr[i+1]);
        	}
        }
        
        answer = new int[myA.size()];
        int size=0;
        for(Integer temp : myA){
        	answer[size++] = temp;
        }
      
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
     
        return answer;
	} 
	
	/*
	public static int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<>();
        int temp = 10;
        for(int num : arr){
            if(temp!=num)
                arrList.add(num);
            temp = num;
        }
        
        answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
       	} 
       	*/
}