package level_0;

public class �迭����հ�_length {
	
	public static double solution(int[] numbers) {
	    double answer = 0;
	    for(int i = 0; i < numbers.length; i++){
	        answer += numbers[i];
	    }
	    answer /= numbers.length;
	    return answer;
	}

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		double result = solution(n);
        System.out.println(result);
	}

}


/*Java���� �迭�� ������ �����ϴ� ���
1.�迭 ���� �����ϱ� : ������Ÿ��[] �迭�����̸�;
2.�迭 ��ü �����ϱ� : �迭�����̸� = new ������Ÿ��[�迭ũ��];
3.�迭 ��ü ������ ���ÿ� �ʱ�ȭ�ϱ� : ������Ÿ��[] �迭�����̸� = {���1, ���2, ..., ���N};
���� ���ÿ���, ������Ÿ���� �迭�� ����� ����� ������ Ÿ��. 
�迭 ������ �̸��� �����ڰ� ������� ���� �� ����.
�迭�� ��Ҵ� �ε����� ������ �� ������, ù ��° ����� �ε����� 0���� ����.

ex

int[] numbers;  // �迭 ���� �����ϱ�
numbers = new int[5];  // �迭 ��ü �����ϱ�
numbers[0] = 1;  // �迭�� ù ��° ��ҿ� �� �Ҵ��ϱ�
int[] numbers2 = {1, 2, 3, 4, 5};  // �迭 ��ü ������ ���ÿ� �ʱ�ȭ�ϱ�
���� ���ÿ����� numbers �迭 ������ ���� �����ϰ�, new Ű���带 ����Ͽ� �迭 ��ü�� ������. 
�׸��� numbers[0]�� ���� 1�� �Ҵ��Ͽ� �迭�� ù ��° ��ҿ� ���� ����. 
����, numbers2 �迭 ������ �����ϰ�, �迭 ��ü�� �����ϸ鼭 ���ÿ� �ʱ�ȭ��. 
�� ���, �迭�� ũ��� �ڵ����� ����� ������ ������.*/




