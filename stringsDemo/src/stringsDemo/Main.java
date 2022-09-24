package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "      Bugün hava çok güzel.    ";

		System.out.println(mesaj);
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf('a'));

		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2)); // 2. index dahil olarak parçalanmış şekilde yazar.
		System.out.println(mesaj.substring(2, 4)); // 2. index dahil olarak başla 4. indexe kadar al. 4. index dahil
													// edilmez.

		for (String kelime : mesaj.split(" ")) { // cümleyi kelimelere ayırmak için kullanılabilir.
			System.out.println(kelime);

		}

		System.out.println(mesaj.toLowerCase()); // mesajı küçük harflerle günceller.
		System.out.println(mesaj.toUpperCase()); // mesajı küçük harflerle günceller.

		System.out.println(mesaj.trim()); // başındaki ve sonundaki boşlukları siler.

	}

}
