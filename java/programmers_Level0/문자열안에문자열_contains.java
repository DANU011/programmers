package level_0;

public class ���ڿ��ȿ����ڿ�_contains {
		static class Solution {
	    public static int solution(String str1, String str2) {
	        int answer = 0; //str1�� str2�� ���ԵǾ�������
	        if(str1.contains(str2))answer = 1;
			else answer = 2;
	        return answer; 
/*contains()
���ڿ��� Ư�� ���ڿ��� �����ϰ� �ִ��� Ȯ��
boolean�� �����ϰ� ������ true, �ƴϸ� false�� ��ȯ
�롤�ҹ���, ������ ���� */
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ab6CDE443fgh22iJKlmn1o";
		String str2="6CD";
		int answer = Solution.solution(str1, str2);
		System.out.println(answer);
	}
}
