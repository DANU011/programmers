package level_0;

public class ���̽��Ƹ޸�ī��_��������� {
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
		System.out.println("�Ѿ�:"+money+"��, "+answer[0]+"��, "+"�ܾ�"+answer[1]+"��");
	}

}
