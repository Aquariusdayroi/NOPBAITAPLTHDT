package Bai7;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private final String maHang;
	private String tenHang ="xxx";
	private double donGia;
	private LocalDate ngaySX = LocalDate.now();
	private LocalDate ngayHH = ngaySX;
	

	public String getTenHang() {
		return tenHang;
	}


	public void setTenHang(String tenHang) {
		if(!tenHang.equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang="xxx";
			
	}

	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		if(donGia > 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}


	public LocalDate getNgaySX() {
		return ngaySX;
	}


	public void setNgaySX(LocalDate ngaySX) {
		if(ngaySX.isAfter(LocalDate.now())) {
			this.ngaySX = ngaySX;
		}
		else 
			this.ngaySX = LocalDate.now();
	}


	public LocalDate getNgayHH() {
		return ngayHH;
	}


	public void setNgayHH(LocalDate ngayHH) {
		if(ngayHH.isAfter(ngaySX)) {
			this.ngayHH = ngayHH;
		}
		else 
			this.ngayHH = ngaySX;
	}
	
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySX, LocalDate ngayHH) throws Exception {
		//set
		if(!maHang.equals(""))
		{
			this.maHang =  maHang;
		}
		else {
				throw new Exception("MA HANG BI RONG");
		}
		///// set ten hang
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}

	public boolean hetHang() {
		if(ngayHH.isBefore(LocalDate.now())||ngayHH.equals(LocalDate.now()))
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		String check;
		if(hetHang()) 
			check ="Hang Het Han";
		else
			check = "";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return  String.format("%10s%13s%20.2f%20s%20s%20s", maHang, tenHang, donGia, dtf.format(ngaySX), dtf.format(ngayHH), check);
		
	}

}