package level_0;

public class �粿ġ_Math {
	public static int solution(int n, int k) {
		int answer = 0;
		int free = Math.floorDiv(n, 10); // ����� �����Ǵ� ����� ���� ���
		answer = 12000 * n + 2000 * (k - free); // ���� �粿ġ�� ����� ���� �ջ�
		return answer;
	}

	public static void main(String[] args) {
		int n = 20;
		int k = 5;
		int result = solution(n, k); // solution �޼ҵ忡 ���� ����
        System.out.println(result);	
	}
}

//public class �粿ġ {
//	public static class Solution {
//		public int solution(int n, int k) {
//			int answer = 0;
//			int free=Math.floorDiv(n,10);
//			answer=12000*n+2000*(k-free);
//			return answer;
//		}
//	}
//	
//	public static void main(String[] args) {
//		int n=20;
//		int k=5;
//		int result = solution();
//        System.out.println(result);
//		
//	}
//}
/*�ڹٿ��� ������, �� ���ϱ�
�� : int a = 26/10;
������ : int b = 26%10;

�ٸ� ���
��: Math.floorDiv(26,10) = 2
������: Math.floorMod(26,10) = 6*/