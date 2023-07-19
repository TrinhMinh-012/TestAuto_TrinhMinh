package Day5P3;

//import java.util.Scanner;
//
//public abstract class Employee {
//	 private String name;
//	 private String yearold;
//	 private String PhoneNumber;
//	 private String Sex;
//	 private String Id;
//	 
//	 private void Employee() {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Nhập tên nhân viên: ");
//		name = sc.nextLine();
//		System.out.println("Nhập tuổi nhân viên: ");
//		yearold = sc.nextLine();
//		System.out.println("Nhập số điện thoại  nhân viên: ");
//		PhoneNumber = sc.nextLine();
//		System.out.println("Nhập giới tính nhân viên: ");
//		Sex = sc.nextLine();
//		System.out.println("Nhập mã Id nhân viên: ");
//		Id = sc.nextLine();
//	}
//	 
//	private void Print() {
//		System.out.println("Tên nhân viên là" + this.getName() +"\n Tuổi: " + this.getYearold() + "\n Số điện thoại của nhân viên: "+ this.getPhoneNumber()+ "\n Giới tính: "+ this.getSex()+ "\n Mã ID: "+ this.getId());
//		
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getYearold() {
//		return yearold;
//	}
//
//	public void setYearold(String yearold) {
//		this.yearold = yearold;
//	}
//
//	public String getPhoneNumber() {
//		return PhoneNumber;
//	}
//
//	public void setPhoneNumber(String phoneNumber) {
//		PhoneNumber = phoneNumber;
//	}
//
//	public String getSex() {
//		return Sex;
//	}
//
//	public void setSex(String sex) {
//		Sex = sex;
//	}
//
//	public String getId() {
//		return Id;
//	}
//
//	public void setId(String id) {
//		Id = id;
//	}
//	 
//}
import java.util.ArrayList;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}