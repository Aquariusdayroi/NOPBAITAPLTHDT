package Bai4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien(11111, "Nguyễn Thanh An", 6.5f, 8.5f);
		DiemSinhVien sv2 = new DiemSinhVien();
		DiemSinhVien sv3 = new DiemSinhVien();
		sv3.setMaSV(22222);
		sv3.setHoTen("Lê Thị Bông");
		sv3.setDiemLT(7.5f);
		sv3.setDiemTH(8.0f);
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã số của sinh viên sv3: ");
		int masv = sc.nextInt();
		System.out.println("Nhập họ và tên của sinh viên sv3: ");
		sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemlt = sc.nextFloat();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemth = sc.nextFloat();
		sv3 = new DiemSinhVien(masv, hoten, diemlt, diemth);
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	}
}
