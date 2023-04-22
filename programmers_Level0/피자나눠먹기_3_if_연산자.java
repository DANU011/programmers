package level_0;

public class ÇÇÀÚ³ª´²¸Ô±â_3_if_¿¬»êÀÚ {
	static class Solution {
	    static int solution(int slice, int n) {
	        int answer = 0;
	        if (2 <= slice && slice <= 10) {
	            if (n > slice) {
	                answer = n / slice;
	                if (n % slice != 0) {
	                    answer++;
	                }
	            } else {
	                answer = 1;
	            }
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int slice=4;
		int n =10;
		int answer = Solution.solution(slice,n);
		System.out.println(answer);
	}
}
