package cocomanmo;

import java.util.ArrayList;
import java.util.Collections;

public class cocomanmo8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 5, 2, 6, 3, 7, 4 }; 
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } }; 

		solution(array, commands);

	}

	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		int siz = commands.length;
		answer = new int[siz];

		ArrayList<Integer> equArr = new ArrayList<>();

		for (int i = 0; i < siz; i++) {
			// Arrays.copyOfRange�� �˾Ҵٸ� for�� 2�� �� �ϵ�.. arraylist �� �ϵ�.. ��������..
			for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
				equArr.add(array[j]);
			}

			Collections.sort(equArr);
			answer[i] = equArr.get(commands[i][2] - 1);
			equArr.clear();
	
		}
		return answer;
	}
}
