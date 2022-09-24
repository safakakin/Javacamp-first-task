package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok iyi geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena değil geçtiniz.");
			break;
		case 'F':
			System.out.println("Malesef kaldınız.");
			break;
		default:
			System.out.println("Geçersiz bir not girdiniz");

		}

	}

}
