package level_0;

public class 아이스아메리카노_산술연산자 {
	static class Solution {
	    public static int[] solution(int money) {
	        int[] answer = new int[2];
	        answer[0]=money/5500;
	        answer[1]=money%5500;
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 19000;
		int[] answer = Solution.solution(money);
		System.out.println("총액:"+money+"원, "+answer[0]+"잔, "+"잔액"+answer[1]+"원");
	}

}
