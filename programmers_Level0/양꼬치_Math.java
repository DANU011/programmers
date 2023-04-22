package level_0;

public class 양꼬치_Math {
	public static int solution(int n, int k) {
		int answer = 0;
		int free = Math.floorDiv(n, 10); // 무료로 제공되는 음료수 개수 계산
		answer = 12000 * n + 2000 * (k - free); // 계산된 양꼬치와 음료수 가격 합산
		return answer;
	}

	public static void main(String[] args) {
		int n = 20;
		int k = 5;
		int result = solution(n, k); // solution 메소드에 인자 전달
        System.out.println(result);	
	}
}

//public class 양꼬치 {
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
/*자바에서 나머지, 몫 구하기
몫 : int a = 26/10;
나머지 : int b = 26%10;

다른 방법
몫: Math.floorDiv(26,10) = 2
나머지: Math.floorMod(26,10) = 6*/