//membuat aturcara latihank3 /
import java.util.Scanner;
public class NAMAANDA{
public static void main (String args[]){
Scanner input = new Scanner (System.in);

String namaPelanggan;
	int point;
	int jumlahMarkah;
	
	System.out.println("Nama pelanggan");
	namaPelanggan=input.nextLine();
	
	System.out.println("bilangan barang yang telah dibeli oleh pelanggan");
	point=input.nextInt();
	jumlahMarkah= point * 3;
	

if(point >= 5){
System.out.println("POINT KESELURUHAN BARANG ADALAH "+ jumlahMarkah + "POINT");
point=input.nextInt();
	jumlahMarkah= point * 3 ;
}
else{
	System.out.println("Bilangan barang tidak boleh kurang daripada 5 barang");
	System.out.println("Masukkan semula jumlah bilangan barang yang telah dibeli oleh pelanggan :");
	point= input.nextInt();
	jumlahMarkah= point * 3;
	System.out.println("POINT KESELURUHAN BARANG ADALAH "+ jumlahMarkah + "POINT");
}
}
}
	
