import java.util.*;
public class Soru9ymh {
	public static void main(String[]args) {
		System.out.println("********Girilen say� negatif olana kadarar pozitif say�lar� toplay�p ortlamas�n� alama*******");
		Scanner klavye=new Scanner(System.in);
	        System.out.println("L�tfen pozitif bir sayi yaziniz, programdan cikmak icin negatif bir sayi yaziniz:");
	        int sayi=klavye.nextInt();
	        int toplam=0;
	        int sayac = 0;
	        
	        while(sayi>=0)
	        {
	            toplam+=sayi;
	            sayac++;
	            System.out.println("L�tfen pozitif bir sayi yaziniz, programdan cikmak icin negatif bir sayi yaziniz");
	            sayi=klavye.nextInt();
	        }
	        System.out.println("girdi�iniz pozitif  say�larin ortalamas�="+toplam/sayac);
	}
}
