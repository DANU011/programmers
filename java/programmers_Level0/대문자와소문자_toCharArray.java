package level_0;

public class �빮�ڿͼҹ���_toCharArray {
	static class Solution {
	    public static String solution(String my_string) {
	        String answer = "";
	        char[] arr = my_string.toCharArray();
	        /*toCharArray()�� Java���� ���ڿ� ��ü�� ���� �迭�� ��ȯ�ϴ� �޼ҵ�*/
			// a ~ z 97 ~122
			// A ~ Z 65~90
			String temp ="";
			//char �迭�� ���� �ϳ��� ������ (asci �ڵ� ���) ��ҹ��� ��ȯ�ϱ�.
			for(int i = 0; i<arr.length; i++) {
				if( arr[i] >= 97 && arr[i] <= 122 ) {
					temp = arr[i] + "";
					/*"temp = arr[i] + ""; "���� �� ���ڿ�("")�� 
					 * char�� ������ arr[i]�� String���� ��ȯ�ϴ� ����*/
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
