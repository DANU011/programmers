package level_0;

import java.util.Arrays;

public class 최댓값만들기_1_sort {
	static class Solution {
    public static int solution(int[] numbers) {
    	int answer=0;
        Arrays.sort(numbers); // 배열 오름차순으로 정렬(작은수~큰수)
        answer = numbers[numbers.length-2]*numbers[numbers.length-1];
        return answer;
        //정렬한 배열의 마지막 전 숫자와 마지막 숫자 곱
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {13,465,7897,456,45,465};
		int answer=Solution.solution(numbers);
		System.out.println(answer);
		
	}

}
