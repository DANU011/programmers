package level_0;

public class ���ڹݺ�����ϱ�_split {
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
            /* ���ڿ��� �ϳ��� �и��Ͽ� �迭 arr�� ������ ��, 
             * �� �迭�� �̿��Ͽ� n�� �ݺ��� ���ڿ��� ����. 
             * �̸� ���ؼ��� �ݺ����� ��ø�Ͽ� �̿��ؾ� �Ѵ�.
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
