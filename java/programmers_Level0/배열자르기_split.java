package level_0;

import java.util.Arrays;

public class 배열자르기_split {
	static class Solution {
	    public static int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = new int[num2-num1+1];
	        int[] subArr = Arrays.copyOfRange(numbers, num1, num2+1); 
	        //num2이 아니고 num2+1 > num2 까지 포함
	        answer = subArr; //왼쪽항에 오른쪽항의 값을 저장
	        return answer;
	       /*split() 메소드는 주어진 구분자를 기준으로 문자열을 
	        * 분리하여 문자열 배열로 반환하는 메소드
	        * ex)String[] strArr = str.split(" ");*/
	            }
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;	
		int num2 = 3;
		int[] answer = Solution.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));
		// 배열 출력을 위해 Arrays.toString() 사용

	}

}
