package Bai2;

public class Demo {
	public static void main(String[] args) {
		Point p = new Point(2, 0, 2, "A");
		System.out.println(p);
		System.out.println("Diem Doi Xung cua "+p.getName()+": "+p.Negative());
		System.out.println("Khoang Cach Tu O den no: "+p.getDistance());
	}
}
