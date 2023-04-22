package level_0;

public class 짝수홀수개수_for_length {
	static class Solution {
	    public static int[] solution(int[] num_list) {
	    	int[] answer = new int[2];
/*solution 메소드에서 반환할 answer 배열 초기화*/
	        int odd=0;
	        int even=0;
	        for(int i =0; i<num_list.length; i++) {
	        	if(num_list[i]%2==0) even++;
	        	else odd++;
	        }
	        //[짝수, 홀수]
	        answer[1]=odd;
	        answer[0]=even;
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		int[] num_list = {5,6,7,8,9,5};
		int[] answer = Solution.solution(num_list);
		System.out.println("{"+answer[0]+","+answer[1]+"}");

	}

}
