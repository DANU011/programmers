package level_0;

public class 피자나눠먹기_1_if {
	static class Solution {
	    public static int solution(int n) {
	        int answer = 0;
	                if (n > 7) {
	                    answer = n / 7;
	                    if (n % 7 != 0) {
	                        answer++;
	                    }
	                } else {
	                    answer = 1;
	                }
	                return answer;
	            } 
	        }
	        //피자는 7조각, 사람은 최대 100명, 한사람 한조각 이상, 사람의 수 n
	        //(n/7)+1 피자의수 
	        //7명 이하일때 따로 넣기
	        //7의 배수인 경우 넣기
//	        if (n>7 && n/7!=0) answer=(n/7)+1;
//	        	/*n/7!=0 이 조건은 항상 참 의미가 없다. 
//	        	 * 마지막 else if 조건에서도 문제가 있다. 
//	        	 * n이 7일 경우에도 해당 조건에 걸리는데, 
//	        	 * 이 경우에는 answer 값을 0으로 반환 
//	        	 * 따라서 n이 7일 경우에도 1을 반환하도록 수정.*/
//	        else if (n>7 && n/7==0) answer=n/7;
//	        else (n<=7)answer=1;
//	        return answer;
//	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int answer= Solution.solution(n);
		System.out.println(answer);
		}
	}
	/*main 메소드에서 Solution.solution(n)과 같이 
	 * Solution 클래스의 static 메소드를 호출할 수 있다. 
	 * answer= int solution(n)과 같이 메소드를 호출하는 구문은 
	 * 올바르지 않다. 메소드를 호출한 결과값을 answer 변수에 할당. 
	 * System.out.println(answer)와 같이 결과값을 출력.*/

/* Solution.solution(n)은 Solution 클래스의 static 메소드 solution을 
 * 호출하는 것. 이 메소드는 매개변수로 정수 n을 받아서, 피자를 몇 판 구입해야하는지를 
 * 계산한 뒤 그 값을 정수 형태로 반환. Solution 클래스에 
 * static 메소드 solution이 있으므로, Solution.solution(n)과 같이 
 * 호출하여 사용할 수 있다. 이를 통해 메소드를 객체 생성 없이 호출할 수 있으며, 
 * 해당 클래스의 인스턴스와 상관없이 동작.*/

