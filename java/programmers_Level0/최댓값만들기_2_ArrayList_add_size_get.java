package level_0;

import java.util.ArrayList;

public class �ִ񰪸����_2_ArrayList_add_size_get {
	static class Solution {
		public static int solution(int[] numbers) {
			int answer = 0;
			ArrayList<Integer> max = new ArrayList<>();
			//ArrayList<Integer> list = new ArrayList<>();
			//max ArrayList �ʱ�ȭ
			for (int i = 0; i < numbers.length; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					max.add(numbers[i]*numbers[j]);
				}
			}
//	        for(int i=0; i<numbers.length; i++) {
//	        	if(i<numbers.length-1) max[i] = numbers[i]*numbers[i+1];
//	        	else if(i==numbers.length-1) max[i] = numbers[i]*numbers[0];
//	        } ��� ����� �� �ƴ� �α� ���Ҹ� ������
			 
            max.sort(null); // max ArrayList ����
            answer = max.get(max.size() - 1);
            // ���ĵ� max ArrayList���� ���� ū �� ��ȯ
            // ArrayList���� ��Ҹ� �������� ��� get() �޼��带 ���
            // ArrayList�� ���̸� ���ϱ� ���ؼ� size() �޼��带 ���
//	        Arrays.sort(numbers);
//	        int len = numbers.length;
//	        answer = numbers[len-1]*numbers[len-2]; ��*�� �������
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, -3, 4, -5 };
		int answer = Solution.solution(numbers);
		System.out.println(answer);

	}

}
