package Bai8;

public class Test {
	public static void main(String[] args) {
//		Tạo 3 đối tượng acc1, acc2, acc3 với các giá trị name, accountNumber, balance lần lượt như sau:
//		{"Ted Murphy", 72354, 100000};
//		{"Jane Smith", 69713, 40000};
//		{"Edward Demsey", 93757,700000}.
		Account acc1 = new Account(72354, "Ted Murphy",  100000);
		Account acc2 = new Account( 69713, "Jane Smith", 40000);
		Account acc3 = new Account(93757, "Edward Demsey", 700000);
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		if(acc1.deposit(250000))
			System.out.println("chuyen tien thanh cong");
		else
			System.out.println("chuyen tien that bai");
		if(acc2.deposit(500000))
			System.out.println("chuyen tien thanh cong");
		else
			System.out.println("chuyen tien that bai");
		if(acc2.withdraw(430000, 2000)) {
			System.out.println("Rut tien thanh cong");
		}
		else {
			System.out.println("Rut tien khong thanh cong");
		}
		acc3.addInterest();
		System.out.println("Tien lai acc3 la: "+acc3.getBalance());
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		if(acc1.transfer(acc2,  100000)) {
			System.out.println("Chuyen tien thanh cong");
		}
		else {
			System.out.println("Chuyen tien khong thanh cong");
		}
		System.out.println(acc1);
		System.out.println(acc2);
	}
}