package level_0;

public class 모음제거_replaceAll {
	static class Solution {
	    public static String solution(String my_string) {
	        String answer = "";
	        answer=my_string.replaceAll("[aeiou]","");
/*대괄호([])는 정규표현식에서 문자 클래스(character class)를 나타냄*/
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "bus";
		String answer = Solution.solution(my_string);
		System.out.println(answer);

	}

}
