package level_0;

public class 가위바위보_equals {
	static class Solution {
	    public static String solution(String rsp) {
	        String answer = "";
	        String[] play = rsp.split("");
	        for(int i=0; i<play.length; i++) {
	        	//가위는 2 바위는 0 보는 5
	        	 if(play[i].equals("2")) answer+="0";
	        	 else if(play[i].equals("0")) answer+="5";
	        	 else answer+="2";
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rsp = "205" ;
		String answer = Solution.solution(rsp);
		System.out.println(answer);
	}
}
