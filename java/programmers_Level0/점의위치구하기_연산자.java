package level_0;

public class ������ġ���ϱ�_������ {
    static class Solution {
        public static int solution(int[] dot) {//[x,y]
            int answer = 0;
            if(dot[0]>0 && dot[1]>0) answer= 1; //1��и�
            else if(dot[0]<0 && dot[1]>0) answer= 2; //2��и�
            else if(dot[0]<0 && dot[1]<0) answer= 3; //3��и�
            else if(dot[0]>0 && dot[1]<0) answer= 4; //4��и�
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] dot = {1, 2};
        int answer = Solution.solution(dot);
        System.out.println(answer);
    }
}
/*Solution Ŭ������ solution �޼ҵ带 static����
main �޼ҵ忡�� int[] �迭�� ������ ��, {} ��� []�� ���
solution �޼ҵ带 ȣ���� ��, Solution.�� ����Ͽ� Ŭ������ static �޼ҵ带 ȣ��
answer ������ main �޼ҵ� ���ο��� �����ϰ� �ʱ�ȭ
System.out.println�� ����Ͽ� answer ���� ���*/

/* static�� ���� ����
 �ڹٿ����� ��ü�� �����ؾ߸� �޼ҵ带 ȣ���� �� �ֽ��ϴ�. 
 ������, Ŭ���� ���ο� static Ű���带 �ٿ��ָ� ��ü ���� ���̵� 
 �ش� �޼ҵ带 �ٷ� ȣ���� �� �ֽ��ϴ�.
 ���� ���, ������ ���� Ŭ������ �����غ��ڽ��ϴ�.

public class MyClass {
    public void myMethod() {
        System.out.println("Hello World!");
    }
}
 
 ���� �ڵ忡�� myMethod�� �ν��Ͻ� �޼ҵ��Դϴ�. 
 ���� �� �޼ҵ带 ȣ���ϱ� ���ؼ��� ���� MyClass�� ��ü�� �����ؾ� �մϴ�.

public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.myMethod(); // "Hello World!" ���
}
 
 ������, MyClass ���ο� static Ű���带 �ٿ��ָ� 
 ��ü ���� ���̵� �ش� �޼ҵ带 �ٷ� ȣ���� �� �ֽ��ϴ�.


public class MyClass {
    public static void myMethod() {
        System.out.println("Hello World!");
    }
}
 
 ���� �ڵ忡�� myMethod�� Ŭ���� �޼ҵ�(���� �޼ҵ�)�Դϴ�. 
 ���� �� �޼ҵ带 ȣ���ϱ� ���ؼ��� ��ü ���� ���̵� 
 Ŭ���� �̸��� ����Ͽ� �ٷ� ȣ���� �� �ֽ��ϴ�.

public static void main(String[] args) {
    MyClass.myMethod(); // "Hello World!" ���
}

 ����, Solution Ŭ������ solution �޼ҵ带 static���� �����ϸ� 
 ��ü ���� ���̵� �ش� �޼ҵ带 �ٷ� ȣ���� �� �ֽ��ϴ�. 
 �̶��� Solution.�� ����Ͽ� Ŭ������ static �޼ҵ带 ȣ���մϴ�.
  */
