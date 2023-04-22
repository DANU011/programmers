package level_0;

public class 중복된숫자개수_length {
	static class Solution {
	    public static int solution(int[] array, int n) {
	        int answer = 0;
	        for(int i = 0; i < array.length ; i++) {
	        	if(array[i]==n) answer++;
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1, 1, 2, 3, 4, 5};
		int n =1;
		int answer = Solution.solution(array,n);
		System.out.println(answer);

	}

}
