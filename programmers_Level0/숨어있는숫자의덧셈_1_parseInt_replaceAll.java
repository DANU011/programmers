package level_0;

public class 숨어있는숫자의덧셈_1_parseInt_replaceAll {
	static class Solution {
		public static int solution(String my_string) {
			int answer = 0;
//			String[] arr = my_string.split("");
//			for (int i = 0; i < arr.length; i++) {
//				int num = Integer.parseInt(String.valueOf(arr[i]),10);
///* Integer.parseInt 메서드를 사용하여 해당 글자를 정수로 변환할때 
// * 해당 글자가 숫자가 아니라면, NumberFormatException이 발생*/
//				if (num < 10) {
//					answer += num;
//					
//				}
//			}       
			        String replace = "";
					replace 
					= my_string.replaceAll("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]", "");
					String[] arry = replace.split("");
			            for(int i = 0; i< arry.length; i++) {
			                answer += Integer.parseInt(arry[i]);
			            }
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "aAb1B2cC34oOp";
		int answer = Solution.solution(my_string);
		System.out.println(answer);
	}
}
