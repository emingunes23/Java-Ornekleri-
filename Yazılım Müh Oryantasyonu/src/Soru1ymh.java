import java.util.Scanner;

public class Soru1ymh {
	
	public static double HacimHesapla( double r ,double  h)
	{
		double hacim;
		hacim = (double)(r*r*h*(Math.PI));
		
		return  hacim;
	}
	public static void main(String[]args) {
		System.out.println("***********Silindiirn Hacmini Hesaplama**********");
		Scanner gir = new Scanner(System.in);

		double r;
		double h;
		System.out.println("Yarý Çapý Giriniz:");
		r=gir.nextDouble();
		System.out.println("Yüksekliði Giriniz:");
		h=gir.nextDouble();
		 double hacim= HacimHesapla(r,h);
		
		System.out.println("Girilen sayilarýn hacim:" + hacim );
		
		
	}

}


