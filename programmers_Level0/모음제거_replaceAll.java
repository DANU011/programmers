package level_0;

public class ��������_replaceAll {
	static class Solution {
	    public static String solution(String my_string) {
	        String answer = "";
	        answer=my_string.replaceAll("[aeiou]","");
/*���ȣ([])�� ����ǥ���Ŀ��� ���� Ŭ����(character class)�� ��Ÿ��*/
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
