package level_0;

public class ��ȣ�ص�_StringBuilder {
	static class Solution {
	    public static String solution(String cipher, int code) {
	        String answer = "";
	                StringBuilder sb = new StringBuilder();
	                String[] cipherArray = cipher.split("");
	                for (int i = 0; i < cipherArray.length; i++) {
	                    if ((i + 1) % code == 0) sb.append(cipherArray[i]);
	                    answer=sb.toString();
	                }
	                return answer;
	            }
	        }
/*�� �ڵ�� �־��� ���ڿ�(cipher)���� ������ ����(code)���� ���ڸ� �����ϴ� 
�޼ҵ��Դϴ�. ���� ���, "HelloWorld" ���ڿ����� ���� 2�� �����ϸ� 
"elWrd" ���ڿ��� ��ȯ�˴ϴ�. ������ �ڼ��� �ϸ� ������ �����ϴ�.
StringBuilder sb = new StringBuilder();
: ���ڿ��� �������� �߰��ϰ����� �� �ִ� StringBuilder ��ü�� �����մϴ�.
String[] cipherArray = cipher.split("");
: cipher ���ڿ��� �� ���ھ� �и��Ͽ� ���ڿ� �迭(cipherArray)�� �����մϴ�.
for (int i = 0; i < cipherArray.length; i++) {
: ���ڿ� �迭(cipherArray)�� �ݺ��Ͽ� ó���մϴ�.
if ((i + 1) % code == 0) sb.append(cipherArray[i]);
: ���� �ε���(i)�� 1�� ������Ű�鼭, ����(code)���� ���� �������� 0�̸�
((i+1)%code==0), StringBuilder ��ü(sb)�� �ش� ����(cipherArray[i])�� 
�߰��մϴ�.
return sb.toString();
: StringBuilder ��ü(sb)�� ���ڿ�(String)���� ��ȯ�Ͽ� ��ȯ�մϴ�.
����, �� �ڵ�� �־��� ���ڿ�(cipher)���� ������ ����(code)���� ���ڸ� �����ϴ� 
�޼ҵ��Դϴ�. ��ȯ�� ���ڿ��� ����(code)���� ���� �������� 0�� ���ڵ�� 
�̷���� ���ڿ��Դϴ�.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String answer = Solution.solution(cipher, code);
		System.out.println(answer);

	}

}
