import java.util.Scanner;

public class BTVNDay7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng nhân viên: ");
		int n = scanner.nextInt();

		String[] employees = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập tên nhân viên thứ " + (i + 1) + ": ");
			employees[i] = scanner.next();
		}

		System.out.println("Danh sách nhân viên:");
		for (String employee : employees) {
			System.out.println(employee);
		}
	}
}
