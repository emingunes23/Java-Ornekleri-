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
		System.out.println("Yar� �ap� Giriniz:");
		r=gir.nextDouble();
		System.out.println("Y�ksekli�i Giriniz:");
		h=gir.nextDouble();
		 double hacim= HacimHesapla(r,h);
		
		System.out.println("Girilen sayilar�n hacim:" + hacim );
		
		
	}

}


