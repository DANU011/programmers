package level_0;

//import java.util.Arrays;

public class ÆíÁö_split {
	static class Solution {
	    public static int solution(String message) {
	        int answer = 0;
	        String m[]=message.split("");
	        answer=m.length*2;
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "hello world!";
		int answer=Solution.solution(message);
		System.out.println(answer);

	}

}
