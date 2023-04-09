package programmers_Level0;

import java.util.Arrays;

public class 인덱스바꾸기_StringToArray_Swap {
	static class Solution {
		public static String solution(String my_string, int num1, int num2) {
			String answer = "";
			char[] my_s = my_string.toCharArray();
			/*
			 * public class StringToArray { public static void main(String[] args) { // 1.
			 * 배열로 변환할 문자열 String str = "How are you?";
			 * 
			 * // 2. 문자열 -> 배열로 변환 char[] arr = str.toCharArray();
			 * 
			 * // 3. 배열 출력 System.out.println(Arrays.toString(arr)); } }
			 */
			swap(my_s, num1, num2);
			answer=new String(my_s);
			return answer;
	}

	private static void swap(char[] my_s, int num1, int num2) {
		char temp;
		temp = my_s[num1];
		my_s[num1] = my_s[num2];
		my_s[num2] = temp;
	}

	/*
	 * Integer[] arr = {1,2,3,4,5};
	 * 
	 * swap(arr, 0, 4);
	 * 
	 * private static <T> void swap(T[] a, int f, int r) { T temp; temp = a[f];
	 * a[f]= a[r]; a[r] = temp; }
	 */
	}

	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		String answer = Solution.solution(my_string, num1, num2);
		System.out.println(answer);
	}

}
