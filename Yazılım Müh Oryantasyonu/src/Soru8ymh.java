import java.util.*;
public class Soru8ymh {

	public static void main(String[]args) {
Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
	}
}
