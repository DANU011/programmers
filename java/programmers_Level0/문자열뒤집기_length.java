package level_0;

public class 문자열뒤집기_length {
    static class Solution {
        public static String solution(String my_string) {
            String answer = "";
            String[] arr = my_string.split("");
            for (int i = 0; i < arr.length; i++) {
            	// 수정 전: arr[i] = arr[(arr.length) - i - 1];
                arr[i] = arr[(arr.length) - i - 1]; //<<<< 수정 후
                /**/
            }
            answer = String.join("", arr);
            return answer;
        }
    }

/*arr[i]를 이용하여 배열의 각 요소를 뒤집은 후, String.join() 메서드를 이용하여 
 배열의 요소들을 하나의 문자열로 합칩니다. 이렇게 하면 문자열이 뒤집힌 결과가 
 answer 변수에 저장되어 반환됩니다.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "hello";
		String answer = Solution.solution(my_string);
		System.out.println(answer);
		
	}

}
