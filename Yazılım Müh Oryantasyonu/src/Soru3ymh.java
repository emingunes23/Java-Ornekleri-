import java.util.Scanner;

public class Soru3ymh {
	public static void main(String[]args) {

		Scanner gir = new Scanner(System.in);
		System.out.println("*********Girilen Say�n�n Fakt�riyelini Bulma*******");
		int sayi1;
		int sonuc=1;

		System.out.println("Fakt�ryeli Hesaplanacak Say�y� Giriniz:");
		sayi1=gir.nextInt();
		for(int i=1;i<=sayi1;i++) {
			sonuc= sonuc*i;
		}
		System.out.println("Girilen Say�n� Fakt�riyeli :"+ sonuc);
	}
}
