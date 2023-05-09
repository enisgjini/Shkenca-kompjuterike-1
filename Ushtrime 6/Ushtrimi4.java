import java.util.Scanner;

public class Ushtrimi4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int nr = 0;
		while(nr % 2 == 0){
			System.out.println("Shtyp nje numer tek:");
			nr = sc.nextInt();
		}

		sc.nextLine();
		String [] vargu = new String[nr];

		for(int i = 0; i < vargu.length; i++){
			System.out.println("Shtyp nje fjale/fjali:");
			vargu[i] = sc.nextLine();
		}	

		System.out.println("Jane shtypur gjithsej " + nr 
			+ " fjalë/fjali dhe fjalia me kusht: " + findLastEnd(vargu));
	}

	public static String findLastEnd(String [] vargu){
		String fjaliaEnd = "";

		for(int i = 0; i < vargu.length; i++){
			if(vargu[i].toLowerCase().endsWith("end")){
				fjaliaEnd = vargu[i];
			}
		}

		return fjaliaEnd;
	}
}

