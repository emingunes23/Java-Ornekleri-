import java.util.Scanner;

public class Soru2ymh {

	
	public static void main(String[]args) {
		Scanner gir = new Scanner(System.in); 
		System.out.println("*********Girilen Say�n� Tek mi �ift mi Oldu�unu Bulan Program *********");
		
		System.out.println("Say�y� Giriniz:");
		int sayi;
		sayi= gir.nextInt();
		if ( sayi%2==0) {
			System.out.println("Girilen Sayi �iftir");
		}
		else {
			System.out.println("Girilen Say� Tektir");
		}
	
	}
}
