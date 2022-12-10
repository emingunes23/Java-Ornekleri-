import java.util.Scanner;

public class Soru2ymh {

	
	public static void main(String[]args) {
		Scanner gir = new Scanner(System.in); 
		System.out.println("*********Girilen Sayýný Tek mi Çift mi Olduðunu Bulan Program *********");
		
		System.out.println("Sayýyý Giriniz:");
		int sayi;
		sayi= gir.nextInt();
		if ( sayi%2==0) {
			System.out.println("Girilen Sayi Çiftir");
		}
		else {
			System.out.println("Girilen Sayý Tektir");
		}
	
	}
}
