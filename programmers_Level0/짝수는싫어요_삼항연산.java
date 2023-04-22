package level_0;

public class ¦���½Ⱦ��_���׿��� {
	static class Solution {
		public static int[] solution(int n) {
			int n2 = n % 2 == 0 ? n / 2 : n / 2 + 1;
			// n�� ¦���� ���� Ȧ���� ��츦 �����Ͽ� n2 ���� �ʱ�ȭ
			int[] answer = new int[n2]; // �迭 ũ�⸦ n2�� �ʱ�ȭ
			for (int i = 0; i < n2; i++) {
				answer[i] = 2 * i + 1;
				// 1���� n������ Ȧ���� ���ʴ�� ����
			}

			return answer;
		}
	}
/* if ���ǹ��� ���ǽ��� ����� ���� ������ �ڵ带 ������ �� ���. 
����, n2 ������ �ʱ�ȭ�� �� ���� ������ ?:�� ����Ͽ� n�� ¦���� ���� 
Ȧ���� ��츦 ������ �� �ִ�. int �ڷ����̹Ƿ� .length �Ӽ��� ����� �� ����.
answer �迭�� �ʱ�ȭ�� �� �迭 ũ�⸦ ����������Ѵ�. 
for ���������� int[i]�� ���� �迭�� �̸��� �ε����� �Բ� ����Ͽ� ���Ҹ� �����Ϸ��� 
�ߴ�. �̴� �߸��� �����̸�, answer[i]�� ���� �迭 �̸��� �ε����� �Բ� ����Ͽ� ���Ҹ� 
�����ؾ� �Ѵ�. for �������� �ε����� ������ �� 2*i+1�� ����Ͽ� Ȧ�� �ε����� �����Ϸ��� 
������, �̴� �߸��� �����̴�. �ùٸ� ������ i++ �Ǵ� i += 1�� ���� ����Ͽ� �ε����� 
�������Ѿ� �Ѵ�.solution �޼ҵ忡���� �־��� �� n�� ���� 1���� n������ Ȧ���� ���ʴ�� 
������ �迭 answer�� ��ȯ�ϵ��� �ڵ带 ������ �� �ִ�.*/

	public static void main(String[] args) {
		int n = 7; // 1,3,5,7
		int[] answer = Solution.solution(n);
		System.out.print("{ ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println("}");
	}
}