import java.util.Scanner;

public class Ushtrimi2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int nr = 0;
		while(nr < 10){
			System.out.println("Shtyp nje numer se paku 10:");
			nr = sc.nextInt();
		}

		sc.nextLine();
		String [] vargu = new String[nr];

		for(int i = 0; i < vargu.length; i++){
			System.out.println("Shtyp nje fjale/fjali:");
			vargu[i] = sc.nextLine();
		}	

		System.out.println("Jane shtypur gjithsej " + nr 
			+ " fjalë/fjali dhe gjatesia mesatare e fjaleve/fjalive qe permbajne 3 simbole aritmetike: " 
		    + findSymbols(vargu));
	}

	public static double findSymbols(String [] vargu){
		int countFjaliteMe3Simbole = 0;
		int shuma = 0;

		for(int i = 0; i < vargu.length; i++){
			int countSimbolet = 0;
			for(int j = 0; j < vargu[i].length(); j++){
				if(vargu[i].charAt(j) == '+' || vargu[i].charAt(j) == '-'
					|| vargu[i].charAt(j) == '/' || vargu[i].charAt(j) == '*'
					|| vargu[i].charAt(j) == '%'){
					countSimbolet++;
				}
			}

			if(countSimbolet == 3){
				countFjaliteMe3Simbole++;
				shuma += vargu[i].length();
			}
		}

		return (double)shuma/countFjaliteMe3Simbole;
	}
}

