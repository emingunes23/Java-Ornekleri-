import java.util.Scanner;
public class Soru7ymh {
	
	
	public static void main(String[]args) {
		System.out.println("****Girilen Say�ya kadar tek say�lar�n toplam�****");
		Scanner gir = new Scanner(System.in);
		int n,toplam=0,i;
		System.out.println("Bir say� giriniz:");
		n=gir.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==1) {
				toplam=toplam+i;
			}
			else {
				
			}
		}
	System.out.println("tek say�lar�n toplam�:"+ toplam);
	}
	

}
