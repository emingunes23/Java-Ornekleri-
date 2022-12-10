import java.util.Scanner;
public class Soru6ymh {
	
	public static void main(String[]args) {
		Scanner gir=new Scanner(System.in);
		int toplam=0;
		System.out.println("***********1 den n e kadar olan sayýlarýn toplamý*********");
		int n;
		System.out.println("Bir Sayý Giriniz:");
		n = gir.nextInt();
		for(int i =1;i<=n;i++) {
			toplam= i+toplam;
			
		}
		System.out.println("1 den " + n + " e kadar olan sayýlarýn toplamý: "+toplam);
	}

}
