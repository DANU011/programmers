package level_0;

public class �ܰ��༺�ǳ���_Integer_toString_ASCII�ڵ� {
	static class Solution {
		public static String solution(int age) {
			String answer = "";
			String temp = Integer.toString(age); 
			// �Ű������� ���� int �� String���� �ٲ�
			for (int i = 0; i < temp.length(); i++) { 
			// String�� ũ�⸸ŭ for��
				answer += (char)((char) temp.charAt(i) + 49); 
				// String�� i��° ���ͷ��� 49�� ���� char���� ����
				// literal : �ҽ� �ڵ� ������ ������ ��
				/* 49�� ASCII �ڵ忡�� ���� '1'�� ��
				age�� �� �ڸ� ���� 1�� ���� ���� ���ڿ��� ��ȯ*/
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;
		String answer = Solution.solution(age);
		System.out.println(answer);

	}

}
