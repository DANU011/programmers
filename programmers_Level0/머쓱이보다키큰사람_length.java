package level_0;

public class �Ӿ��̺���Űū���_length {
	static class Solution {
	    public static int solution(int[] array, int height) {
	        int answer = 0;
	        /*array ={153,156,188,178,189}
	         * height = 160
	         *0~n��° �� ū��� ������ answer++*/
	        for (int i=0; i<array.length;i++) {
	        	if(height < array[i]) answer++;
	        	else continue;
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {150,158,160,178,180,181};
		int height = 178;
		int answer = Solution.solution(array, height);
		System.out.println(answer);

	}

}
