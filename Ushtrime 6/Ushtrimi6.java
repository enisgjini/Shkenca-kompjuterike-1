import java.util.Scanner;

public class Ushtrimi6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int nr;
		do{
			System.out.println("Shtyp nje numer se paku 10:");
			nr = sc.nextInt();
		}while(nr < 10);

		sc.nextLine();
		String [] vargu = new String[nr];

		for(int i = 0; i < vargu.length; i++){
			System.out.println("Shtyp nje fjale/fjali:");
			vargu[i] = sc.nextLine();
		}	

		System.out.println("Jane shtypur gjithsej " + nr 
			+ " fjalë/fjali dhe fjalia me e gjate eshte: " + findText(vargu));
	}

	public static String findText(String [] vargu){
		String fjaliaMMV = "";

		for(int i = vargu.length - 3; i < vargu.length; i++){
			if(fjaliaMMV.equals("") || fjaliaMMV.length() < vargu[i].length()){
				fjaliaMMV = vargu[i];
			}
		}

		return fjaliaMMV;
	}
}

