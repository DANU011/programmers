package level_0;

public class 문자열안에문자열_contains {
		static class Solution {
	    public static int solution(String str1, String str2) {
	        int answer = 0; //str1에 str2가 포함되어있으면
	        if(str1.contains(str2))answer = 1;
			else answer = 2;
	        return answer; 
/*contains()
문자열이 특정 문자열을 포함하고 있는지 확인
boolean형 포함하고 있으면 true, 아니면 false를 반환
대·소문자, 공백을 구분 */
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ab6CDE443fgh22iJKlmn1o";
		String str2="6CD";
		int answer = Solution.solution(str1, str2);
		System.out.println(answer);
	}
}
