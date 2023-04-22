package level_0;

import java.util.Scanner;

public class 직각삼각형출력하기_Scanner_이중for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
/*import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine(); // 한 줄을 읽어서 문자열로 반환
        
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt(); // 정수형 데이터를 읽어서 반환
        
        System.out.println("입력된 이름: " + name);
        System.out.println("입력된 나이: " + age);
        
        scanner.close(); // Scanner 객체 닫기
    }
}
위 코드에서는 Scanner 객체를 생성하고, nextLine() 메서드와 nextInt() 메서드를 
사용하여 사용자로부터 문자열과 정수형 데이터를 입력받습니다. 
마지막으로 Scanner 객체를 닫아줍니다(close() 메서드 호출).
Scanner 클래스는 입력 버퍼를 사용하기 때문에, 입력 버퍼에 남아있는 데이터가 있을 경우에는 
이전에 입력받은 데이터가 읽힐 수 있습니다. 따라서, nextLine() 메서드를 사용하여 문자열을 
입력받은 후에는 nextInt() 메서드를 사용하기 전에 nextLine() 메서드를 호출하여 
입력 버퍼를 비워주는 것이 좋습니다.
*/
		String x = "*";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
