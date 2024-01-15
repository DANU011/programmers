package level_0;

public class 외계행성의나이_Integer_toString_ASCII코드 {
	static class Solution {
		public static String solution(int age) {
			String answer = "";
			String temp = Integer.toString(age); 
			// 매개변수로 들어온 int 를 String으로 바꿈
			for (int i = 0; i < temp.length(); i++) { 
			// String의 크기만큼 for문
				answer += (char)((char) temp.charAt(i) + 49); 
				// String의 i번째 리터럴에 49를 더한 char값을 넣음
				// literal : 소스 코드 내에서 고정된 값
				/* 49는 ASCII 코드에서 문자 '1'의 값
				age의 각 자리 수에 1을 더한 값을 문자열로 반환*/
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;
		String answer = Solution.solution(age);
		System.out.println(answer);

	}

}
