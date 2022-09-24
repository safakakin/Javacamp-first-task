package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };

		for (double number : myList) {
			System.out.println(number);
		}

		double total = 0;
		for (double number : myList) {
			total = number + total;
		}
		System.out.println("Toplam = " + total);

		double enBuyuk = 0;
		for (double number : myList) {
			if (number > enBuyuk) {
				enBuyuk = number;
			}
		}
		System.out.println("En buyuk sayı = " + enBuyuk);

	}

}
