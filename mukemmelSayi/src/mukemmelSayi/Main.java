package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 7;

		int pozitifBolenToplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				pozitifBolenToplam = i + pozitifBolenToplam;
			}

		}
		if (pozitifBolenToplam == sayi) {
			System.out.println(sayi + " bir mükemmel sayıdır.");
		} else {
			System.out.println(sayi + " bir mükemmel sayı değildir..");
		}

	}

}
