package Day5P3;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin nhân viên
        System.out.println("Nhập thông tin nhân viên:");
        while (true) {
            System.out.println("Chọn loại nhân viên (1: Developer, 2: Tester, 3: Business Analyst, 0: Kết thúc): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng newline sau khi nhập số

            if (choice == 0) {
                break;
            }

            System.out.print("Nhập tên nhân viên: ");
            String name = scanner.nextLine();

            switch (choice) {
                case 1:
                    employees.add(new Developer(name));
                    break;
                case 2:
                    employees.add(new Tester(name));
                    break;
                case 3:
                    employees.add(new BusinessAnalyst(name));
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }

        // In danh sách nhân viên
        System.out.println("Danh sách nhân viên:");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println("Tên: " + employee.getName() + ", Vai trò: " + employee.getRole());
        }
    }
}
