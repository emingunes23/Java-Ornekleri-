import java.util.Scanner;
public class Soru5ymh {
	
	public static void main(String[]args) {
		Scanner gir = new Scanner(System.in);
		System.out.println("*********VÝZE VE FÝNAL NOTU GÝRÝLEN ÖÐRENCÝNÝN NOT ORTALAMASINI HESAPLAMA*********");
		int vize,finalNotu,sonuc1,sonuc2;
		double ortalama;
		System.out.println("Vize Notunuzu Giriniz:");
		vize= gir.nextInt();
		System.out.println("Final Notunuzu Giriniz:");
		finalNotu= gir.nextInt();
		
		ortalama= (vize*0.4)+(finalNotu*0.6);
		System.out.println("Dersinin Ortalama Notu:"+ ortalama);
		
	}

}
