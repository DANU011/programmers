package level_0;

public class ���ڿ�������_length {
    static class Solution {
        public static String solution(String my_string) {
            String answer = "";
            String[] arr = my_string.split("");
            for (int i = 0; i < arr.length; i++) {
            	// ���� ��: arr[i] = arr[(arr.length) - i - 1];
                arr[i] = arr[(arr.length) - i - 1]; //<<<< ���� ��
                /**/
            }
            answer = String.join("", arr);
            return answer;
        }
    }

/*arr[i]�� �̿��Ͽ� �迭�� �� ��Ҹ� ������ ��, String.join() �޼��带 �̿��Ͽ� 
 �迭�� ��ҵ��� �ϳ��� ���ڿ��� ��Ĩ�ϴ�. �̷��� �ϸ� ���ڿ��� ������ ����� 
 answer ������ ����Ǿ� ��ȯ�˴ϴ�.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "hello";
		String answer = Solution.solution(my_string);
		System.out.println(answer);
		
	}

}
