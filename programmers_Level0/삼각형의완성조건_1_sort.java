package level_0;

import java.util.Arrays;

public class 삼각형의완성조건_1_sort {
	static class Solution {
	    public static int solution(int[] sides) {
	        int answer = 0;
	        Arrays.sort(sides);
	        if(sides[0]+sides[1]>sides[2]) answer=1;
	        else answer=2;
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sides = {1, 2, 3};
		int answer = Solution.solution(sides);
		System.out.println(answer);
	}

}
