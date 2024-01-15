package programmers_Level0;

import java.util.Arrays;

/*
 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
 my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 소문자 toLowerCase -> array -> sort -> string
*/
public class 문자열정렬하기2_toLowerCase_toCharArray_sort {
	static class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        my_string = my_string.toLowerCase();
	        char[] str = my_string.toCharArray();
	        Arrays.sort(str);
	        answer = new String(str);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String my_string = "heLLo";
		Solution s = new Solution();
		String answer = s.solution(my_string);
		System.out.println(answer);
	}

}
