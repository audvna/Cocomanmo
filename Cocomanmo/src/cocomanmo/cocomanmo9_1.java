package cocomanmo;

import java.util.ArrayList;

public class cocomanmo9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone_number= "01033334444";
		solution(phone_number);
	}
	
	/*
	 ���� : �ڵ��� ��ȣ ������
	 ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
	��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
	 */

	public static String solution(String phone_number) {
        String answer = "";
        
        int size = phone_number.length();
        int cnt=0;        
        ArrayList<String> ex = new ArrayList<>();
        
        for(String str : phone_number.split("")) {
        	if(ex.size() < size-4 ? ex.add("*") : ex.add(str)); 
        	answer+=ex.get(cnt++);
        }
     
        return answer;
    }
}
