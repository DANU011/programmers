package level_0;

import java.util.Scanner;

public class �����ﰢ������ϱ�_Scanner_����for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int n = sc.nextInt();
/*import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner ��ü ����
        
        System.out.print("�̸��� �Է��ϼ���: ");
        String name = sc.nextLine(); // �� ���� �о ���ڿ��� ��ȯ
        
        System.out.print("���̸� �Է��ϼ���: ");
        int age = sc.nextInt(); // ������ �����͸� �о ��ȯ
        
        System.out.println("�Էµ� �̸�: " + name);
        System.out.println("�Էµ� ����: " + age);
        
        scanner.close(); // Scanner ��ü �ݱ�
    }
}
�� �ڵ忡���� Scanner ��ü�� �����ϰ�, nextLine() �޼���� nextInt() �޼��带 
����Ͽ� ����ڷκ��� ���ڿ��� ������ �����͸� �Է¹޽��ϴ�. 
���������� Scanner ��ü�� �ݾ��ݴϴ�(close() �޼��� ȣ��).
Scanner Ŭ������ �Է� ���۸� ����ϱ� ������, �Է� ���ۿ� �����ִ� �����Ͱ� ���� ��쿡�� 
������ �Է¹��� �����Ͱ� ���� �� �ֽ��ϴ�. ����, nextLine() �޼��带 ����Ͽ� ���ڿ��� 
�Է¹��� �Ŀ��� nextInt() �޼��带 ����ϱ� ���� nextLine() �޼��带 ȣ���Ͽ� 
�Է� ���۸� ����ִ� ���� �����ϴ�.
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
