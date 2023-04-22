package level_0;

public class 배열두배만들기_length {
	static class Solution {
	    public static int[] solution(int[] numbers) {
	        int[] answer = new int[numbers.length]; //배열 초기화
	        for(int i=0; i<numbers.length ; i++) {
	        	answer[i]=numbers[i]*2; 
	        	//numbers 배열의 각 원소를 2배로 만들어서 answer 배열에 저장
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,5,8,7};
		int[] answer = Solution.solution(numbers);
		System.out.println("{"+answer[0]+","+answer[1]+","+answer[2]+","+answer[3]+"}");
		
	}

}
