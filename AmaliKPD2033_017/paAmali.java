//membuat aturcara amali syarikat global trade/
import java.util.Scanner;
public class paAmali{
public static void main (String args[]){
Scanner input = new Scanner (System.in);

String namaPekerja;
	int bilhari;
	int bilgaji;
	
	System.out.println("Masukkan nama pekerja");
	namaPekerja=input.nextLine();
	System.out.println("");
	
	System.out.println("Masukkan bilangan hari bekerja sebulan: ");
	bilhari=input.nextInt();
	System.out.println("");

		// Ulang selagi bilangan hari lebih 31
		while (bilhari > 31) {
			System.out.println(" Bilangan hari tidak boleh melebihi 31 hari");
			System.out.println("Masukkan semula bilangan hari bekerja:");
			bilhari = input.nextInt();
			System.out.println("");
			System.out.println(" Rumusan gaji bulanan bagi Ahmad Arifudin");
		}
		bilgaji = bilhari * 160;
		System.out.println("Jumlah hari bekerja: " + bilhari );
		System.out.println("Gaji Bulanan:  "+ bilgaji);
		
	
}
}
