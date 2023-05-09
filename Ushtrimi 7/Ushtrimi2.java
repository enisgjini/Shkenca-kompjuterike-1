import java.util.Scanner;

public class Ushtrimi2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totali = 0;
		while (totali < 10) {
			System.out.println("Shtyp nje numer se paku 10:");
			totali = sc.nextInt();
		}

		String[] vargu = new String[totali];
		sc.nextLine();

		for (int i = 0; i < vargu.length; i++) {
			System.out.println("Shtyp nje fjale/fjali:");
			vargu[i] = sc.nextLine();
		}

		double[] v2 = findWord(vargu);
		double gjat1 = v2[0];
		double gjat2 = v2[1];

		System.out.println("Jane shtypur gjithsej " + totali
				+ " fjale/fjali dhe gjatesia mesatare e pare " + gjat1
				+ ", gjatesia mesatare e dyte " + gjat2);
	}

	public static double[] findWord(String[] vargu) {
		double[] varguMe2Gjatesite = new double[2];
		int shumaPr = 0, shumaPz = 0;
		int countPr = 0, countPz = 0;

		for (int i = 0; i < vargu.length; i++) {
			if (vargu[i].contains("Prishtine")) {
				shumaPr += vargu[i].length();
				countPr++;
			}

			if (vargu[i].contains("Prizren")) {
				shumaPz += vargu[i].length();
				countPz++;
			}
		}

		varguMe2Gjatesite[0] = (double) shumaPr / countPr;
		varguMe2Gjatesite[1] = (double) shumaPz / countPz;

		return varguMe2Gjatesite;
	}
}