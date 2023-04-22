package level_0;

import java.util.Arrays;

public class 중앙값구하기_sort {
	static class Solution {
	    public static int solution(int[] array) {
	        int answer = 0;
	        Arrays.sort(array);
	        int len=array.length/2;
	        answer=array[len];
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 7, 10, 11};
		int answer = Solution.solution(array);
		System.out.println(answer);

	}

}
