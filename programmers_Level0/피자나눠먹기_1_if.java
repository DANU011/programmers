package level_0;

public class ���ڳ����Ա�_1_if {
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
	        //���ڴ� 7����, ����� �ִ� 100��, �ѻ�� ������ �̻�, ����� �� n
	        //(n/7)+1 �����Ǽ� 
	        //7�� �����϶� ���� �ֱ�
	        //7�� ����� ��� �ֱ�
//	        if (n>7 && n/7!=0) answer=(n/7)+1;
//	        	/*n/7!=0 �� ������ �׻� �� �ǹ̰� ����. 
//	        	 * ������ else if ���ǿ����� ������ �ִ�. 
//	        	 * n�� 7�� ��쿡�� �ش� ���ǿ� �ɸ��µ�, 
//	        	 * �� ��쿡�� answer ���� 0���� ��ȯ 
//	        	 * ���� n�� 7�� ��쿡�� 1�� ��ȯ�ϵ��� ����.*/
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
	/*main �޼ҵ忡�� Solution.solution(n)�� ���� 
	 * Solution Ŭ������ static �޼ҵ带 ȣ���� �� �ִ�. 
	 * answer= int solution(n)�� ���� �޼ҵ带 ȣ���ϴ� ������ 
	 * �ùٸ��� �ʴ�. �޼ҵ带 ȣ���� ������� answer ������ �Ҵ�. 
	 * System.out.println(answer)�� ���� ������� ���.*/

/* Solution.solution(n)�� Solution Ŭ������ static �޼ҵ� solution�� 
 * ȣ���ϴ� ��. �� �޼ҵ�� �Ű������� ���� n�� �޾Ƽ�, ���ڸ� �� �� �����ؾ��ϴ����� 
 * ����� �� �� ���� ���� ���·� ��ȯ. Solution Ŭ������ 
 * static �޼ҵ� solution�� �����Ƿ�, Solution.solution(n)�� ���� 
 * ȣ���Ͽ� ����� �� �ִ�. �̸� ���� �޼ҵ带 ��ü ���� ���� ȣ���� �� ������, 
 * �ش� Ŭ������ �ν��Ͻ��� ������� ����.*/

