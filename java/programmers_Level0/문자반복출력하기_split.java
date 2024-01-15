package level_0;

public class 문자반복출력하기_split {
    static class Solution {
        public static String solution(String my_string, int n) {
            String answer = "";
            String[] arr = my_string.split("");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < n; j++) {
                    answer += arr[i];
                }
            }
            return answer;
            /* 문자열을 하나씩 분리하여 배열 arr에 저장한 후, 
             * 이 배열을 이용하여 n번 반복된 문자열을 생성. 
             * 이를 위해서는 반복문을 중첩하여 이용해야 한다.
			 */
        }
    }

    public static void main(String[] args) {
        String my_string = "apple";
        int n = 3;
        String answer = Solution.solution(my_string, n);
        System.out.println(answer);
    }
}
