package level_0;

public class �迭�ι踸���_length {
	static class Solution {
	    public static int[] solution(int[] numbers) {
	        int[] answer = new int[numbers.length]; //�迭 �ʱ�ȭ
	        for(int i=0; i<numbers.length ; i++) {
	        	answer[i]=numbers[i]*2; 
	        	//numbers �迭�� �� ���Ҹ� 2��� ���� answer �迭�� ����
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,5,8,7};
		int[] answer = Solution.solution(numbers);
		System.out.println("{"+answer[0]+","+answer[1]+","+answer[2]+","+answer[3]+"}");
		
	}

}
