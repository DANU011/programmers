package level_0;

public class �������Ǻ��ϱ�_for_break {
	static class Solution {
		public static int solution(int n) {
			int answer = 0;
			for (int i = 1; i <= n / i; i++) {
//������ �� ��� n=i*i �ִ�� �ʿ��� �� i
				if (n % i == 0 && n / i == i) {
					answer = 1; 
// n�� i*i�� ���� ������ ������ ��Ÿ�� �� ������ 1�� ����
					break;
				}
			}
			if (answer == 0) {
				answer = 2; 
// ������ ��� ���Ҵµ��� answer�� 0�̸�, n�� �������� �ƴϹǷ� answer�� 2�� ����
			}
			return answer;
		}
	}

	/* ������ ��� ���Ҵµ��� answer�� 0�̸�, n�� �������� �ƴϹǷ� answer�� 2�� ���� */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 144;
		int answer = Solution.solution(n);
		System.out.println(answer);

	}

}
