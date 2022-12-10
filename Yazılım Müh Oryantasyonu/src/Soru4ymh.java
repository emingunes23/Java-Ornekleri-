import java.util.Scanner;
public class Soru4ymh {
	
	public static void main(String[]args) {
		Scanner meg = new Scanner(System.in);
		System.out.println("***********Girilen Sayýya Kadar Çift Sayýlarý Yazma********");
		int sayi;

		System.out.println("Sayýyý Giriniz:");
		sayi= meg.nextInt();
		
		for(int i=0; i<=sayi ; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				
			}
			
		}
		
		
	}

}
