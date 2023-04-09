package programmers_Level0;

import java.util.Arrays;

public class 배열회전시키기_Equals {
	static class Solution {
		public static int[] solution(int[] numbers, String direction) {
			int[] answer = new int[numbers.length];
			if (direction.equals("right")) {//equals, ==는 객체참조
                for (int i = 0; i < numbers.length; i++) {
                    if (i != numbers.length - 1) {
                        answer[i + 1] = numbers[i];
                    } else {
                        answer[0] = numbers[numbers.length - 1];
                    }
                }
            } else if (direction.equals("left")) {
                for (int i = 0; i < numbers.length; i++) {
                    if (i != 0) {
                        answer[i - 1] = numbers[i];
                    } else {
                        answer[numbers.length - 1] = numbers[0];
                    }
                }
            }
            return answer;
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3 };
		String direction = "right";
		int[] answer = Solution.solution(numbers, direction);
		System.out.println(Arrays.toString(answer));
	}

}
