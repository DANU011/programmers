package level_0;

public class 대문자와소문자_toCharArray {
	static class Solution {
	    public static String solution(String my_string) {
	        String answer = "";
	        char[] arr = my_string.toCharArray();
	        /*toCharArray()은 Java에서 문자열 객체를 문자 배열로 변환하는 메소드*/
			// a ~ z 97 ~122
			// A ~ Z 65~90
			String temp ="";
			//char 배열로 만들어서 하나씩 꺼내고 (asci 코드 사용) 대소문자 변환하기.
			for(int i = 0; i<arr.length; i++) {
				if( arr[i] >= 97 && arr[i] <= 122 ) {
					temp = arr[i] + "";
					/*"temp = arr[i] + ""; "에서 빈 문자열("")은 
					 * char형 변수인 arr[i]를 String으로 변환하는 역할*/
					answer += temp.toUpperCase();
				} else if( arr[i] >=65 && arr[i] <= 90){
					temp = arr[i] + "";
					answer += temp.toLowerCase();
				}
			}
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "cccCCC";
		String answer = Solution.solution(my_string);
		System.out.println(answer);

	}

}
