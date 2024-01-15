package level_0;

public class 짝수의합_for {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 20;
        int result = solution(n);
        System.out.println("0부터 " + n + "까지의 짝수의 합: " + result);
    }
}

/*Java에서 static 키워드는 변수, 메서드 또는 클래스에 적용될 수 있습니다. 
static 키워드가 클래스에 적용되면 해당 클래스는 static 클래스가 됩니다.

static 클래스는 다음과 같은 특징을 갖습니다.
> 객체를 생성하지 않고 사용할 수 있습니다.
static 클래스의 메서드와 변수는 클래스 자체에 속하므로 
객체를 생성하지 않고 사용할 수 있습니다.
> static 메서드와 변수는 클래스 메모리 영역에 로드됩니다.
static 클래스의 메서드와 변수는 객체마다 독립적으로 저장되지 않습니다. 
대신 클래스 메모리 영역에 저장됩니다.
따라서 static 메서드와 변수를 사용하여 메모리 공간을 절약할 수 있습니다.
> static 클래스는 다른 클래스에서 상속할 수 없습니다.
static 클래스는 객체를 생성하지 않고 사용할 수 있기 때문에 
다른 클래스에서 상속할 필요가 없습니다. 
따라서 static 클래스는 다른 클래스에서 상속할 수 없습니다.
> static 클래스는 중첩 클래스(Nested Class)로 사용됩니다.
static 클래스는 다른 클래스 내에 중첩되어 사용될 수 있습니다. 
이러한 static 클래스는 외부 클래스의 인스턴스를 사용하지 않고도 
독립적으로 사용될 수 있습니다. 
이러한 static 클래스를 중첩 static 클래스라고 부릅니다.
대표적인 예로는 java.lang.Math 클래스가 있습니다. 
Math 클래스는 객체를 생성하지 않고 사용할 수 있으며, 
메서드와 변수는 클래스 메모리 영역에 로드됩니다. 
이러한 Math 클래스는 static 클래스입니다.*/
