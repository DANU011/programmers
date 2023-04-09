package programmers_Level1;
/*
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
*/
public class 평균구하기 {
	static class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        double sum=0; //정수형끼리 연산은 나머지 벼려짐.
	        for(int i = 0; i < arr.length ; i++) {
	        	sum += arr[i];
	        }
	        answer = sum/arr.length;
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		Solution sol = new Solution();
		double answer=sol.solution(arr);
		System.out.println(answer);
	}

}
