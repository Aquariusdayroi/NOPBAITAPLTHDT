package Bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;




public class Test {
	public static HangThucPham nhap_ThucPham() throws Exception {
		Scanner sc = new Scanner(System.in);
		String maHang = sc.nextLine();
		
		sc = new Scanner(System.in);
		String tenHang = sc.nextLine();
		
		sc = new Scanner(System.in);
		double donGia = sc.nextDouble();
		
		sc = new Scanner(System.in);
		String ngaySX = sc.nextLine();
		
//		System.out.println(ngaySX);
		sc = new Scanner(System.in);
		String ngayHH = sc.nextLine();
		

		//convert
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate Local_ngaySX = LocalDate.parse(ngaySX, dtf);
		LocalDate Local_ngayHH = LocalDate.parse(ngayHH, dtf);
		
		HangThucPham res = new HangThucPham(maHang, tenHang, donGia, Local_ngaySX, Local_ngayHH);
		return res;
	}
	public static void main(String[] args) {
		try { 
			
				HangThucPham tp1 = nhap_ThucPham();
//				HangThucPham tp2 = nhap_ThucPham();
//				HangThucPham tp3 = nhap_ThucPham();
//				String res = Khung();
//				System.out.println(res);
				System.out.println("--------------------------------------------------------------------------------------------------------");
				String res = String.format("%13s%15s%15s%20s%20s%15s", "Ma_Hang", "Ten_Hang", "Don_Gia", "Ngay_San_Xuat", "Ngay_Het_Han","Ghi_Chu");
				System.out.println(res);
				System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println(tp1);
//				System.out.println(tp2);0
//				System.out.println(tp3);
//			System.out.println("helo");
				
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
}