package level_0;

public class 점의위치구하기_연산자 {
    static class Solution {
        public static int solution(int[] dot) {//[x,y]
            int answer = 0;
            if(dot[0]>0 && dot[1]>0) answer= 1; //1사분면
            else if(dot[0]<0 && dot[1]>0) answer= 2; //2사분면
            else if(dot[0]<0 && dot[1]<0) answer= 3; //3사분면
            else if(dot[0]>0 && dot[1]<0) answer= 4; //4사분면
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] dot = {1, 2};
        int answer = Solution.solution(dot);
        System.out.println(answer);
    }
}
/*Solution 클래스와 solution 메소드를 static으로
main 메소드에서 int[] 배열을 생성할 때, {} 대신 []을 사용
solution 메소드를 호출할 때, Solution.을 사용하여 클래스의 static 메소드를 호출
answer 변수를 main 메소드 내부에서 선언하고 초기화
System.out.println을 사용하여 answer 값을 출력*/

/* static을 쓰는 이유
 자바에서는 객체를 생성해야만 메소드를 호출할 수 있습니다. 
 하지만, 클래스 내부에 static 키워드를 붙여주면 객체 생성 없이도 
 해당 메소드를 바로 호출할 수 있습니다.
 예를 들어, 다음과 같은 클래스를 생성해보겠습니다.

public class MyClass {
    public void myMethod() {
        System.out.println("Hello World!");
    }
}
 
 위의 코드에서 myMethod는 인스턴스 메소드입니다. 
 따라서 이 메소드를 호출하기 위해서는 먼저 MyClass의 객체를 생성해야 합니다.

public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.myMethod(); // "Hello World!" 출력
}
 
 하지만, MyClass 내부에 static 키워드를 붙여주면 
 객체 생성 없이도 해당 메소드를 바로 호출할 수 있습니다.


public class MyClass {
    public static void myMethod() {
        System.out.println("Hello World!");
    }
}
 
 위의 코드에서 myMethod는 클래스 메소드(정적 메소드)입니다. 
 따라서 이 메소드를 호출하기 위해서는 객체 생성 없이도 
 클래스 이름을 사용하여 바로 호출할 수 있습니다.

public static void main(String[] args) {
    MyClass.myMethod(); // "Hello World!" 출력
}

 따라서, Solution 클래스와 solution 메소드를 static으로 변경하면 
 객체 생성 없이도 해당 메소드를 바로 호출할 수 있습니다. 
 이때는 Solution.을 사용하여 클래스의 static 메소드를 호출합니다.
  */
