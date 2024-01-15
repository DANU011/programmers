package level_0;

import java.util.ArrayList;

public class 최댓값만들기_2_ArrayList_add_size_get {
	static class Solution {
		public static int solution(int[] numbers) {
			int answer = 0;
			ArrayList<Integer> max = new ArrayList<>();
			//ArrayList<Integer> list = new ArrayList<>();
			//max ArrayList 초기화
			for (int i = 0; i < numbers.length; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					max.add(numbers[i]*numbers[j]);
				}
			}
//	        for(int i=0; i<numbers.length; i++) {
//	        	if(i<numbers.length-1) max[i] = numbers[i]*numbers[i+1];
//	        	else if(i==numbers.length-1) max[i] = numbers[i]*numbers[0];
//	        } 모든 경우의 수 아님 인근 원소만 곱해짐
			 
            max.sort(null); // max ArrayList 정렬
            answer = max.get(max.size() - 1);
            // 정렬된 max ArrayList에서 가장 큰 값 반환
            // ArrayList에서 요소를 가져오는 방법 get() 메서드를 사용
            // ArrayList의 길이를 구하기 위해서 size() 메서드를 사용
//	        Arrays.sort(numbers);
//	        int len = numbers.length;
//	        answer = numbers[len-1]*numbers[len-2]; 음*음 고려안함
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
