package level_0;

public class ¦��Ȧ������_for_length {
	static class Solution {
	    public static int[] solution(int[] num_list) {
	    	int[] answer = new int[2];
/*solution �޼ҵ忡�� ��ȯ�� answer �迭 �ʱ�ȭ*/
	        int odd=0;
	        int even=0;
	        for(int i =0; i<num_list.length; i++) {
	        	if(num_list[i]%2==0) even++;
	        	else odd++;
	        }
	        //[¦��, Ȧ��]
	        answer[1]=odd;
	        answer[0]=even;
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		int[] num_list = {5,6,7,8,9,5};
		int[] answer = Solution.solution(num_list);
		System.out.println("{"+answer[0]+","+answer[1]+"}");

	}

}
