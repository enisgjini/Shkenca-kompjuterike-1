import java.util.Scanner;

public class Ushtrimi5{
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

		System.out.println("Jane shtypur gjithsej " + nr + " fjalë/fjali dhe " 
			+ countWords(vargu) + " ishin të njejta");
	}

	public static int countWords(String [] vargu){
		int count = 0;

		for(int i = 0; i < vargu.length; i++){
			String [] fjalet = vargu[i].split(" ");
			count += fjalet.length;
		}

		return count;
	}
}