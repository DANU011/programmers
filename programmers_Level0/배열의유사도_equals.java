package level_0;

public class �迭�����絵_equals {
	static class Solution {
		public static int solution(String[] s1, String[] s2) {
			int answer = 0;
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					if (s1[i].equals(s2[j])) {
						/*equals() �޼ҵ带 ����Ͽ� ���ڿ��� ���������� 
						 * Ȯ�� Java������ == �����ڸ� ����Ͽ� �� ���� 
						 * ���ڿ��� ���� ��, �� ���ڿ���
						 * ��Ȯ�� ���� ��ü�� ��쿡�� true�� ��ȯ*/
						answer++;
						break;
		/*break ���� ����Ͽ�, s1 �迭�� �� ���ڿ��� s2 �迭�� ��� ���ڿ��� 
		 * ���� ��, �̹� ���� ���ڿ��� �߰ߵǾ��ٸ� �� �̻�
		 * ������ �ʰ� ���� ���ڿ��� �Ѿ�� ���� �ǹ� ���� �ݺ��������� 
		 * ���� �ݺ����� ������ �Ϸ�� ������ �ܺ� �ݺ����� ������� ����.
		 * ����, ���� �ݺ������� break ���� ����Ͽ� �����Ű��, 
		 * �ܺ� �ݺ������� ���� �ݺ��� ������ �� �ִ�. ���� �ݺ������� ���ڿ���
		 * ��ġ�ϴ� ��� break ���� ����Ͽ� �ݺ����� �����Ű��, 
		 * �ܺ� �ݺ������� ���� ���ڿ��� ���� �� �ֵ��� �Ѵ�. �̷��� �ϸ�, ����
		 * ���ڿ��� ã���� �� ���ʿ��� �ݺ��� ���� �� �־ ���� �ӵ��� ���� �� �ִ�.*/
					}
				}
			}
			return answer;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] s1 = { "a", "b", "c" };
			String[] s2 = { "com", "b", "d", "p", "c" };
			int answer = Solution.solution(s1, s2);
			System.out.println(answer);
		}

	}
}
