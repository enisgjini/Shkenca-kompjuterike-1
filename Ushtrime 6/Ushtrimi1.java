import java.util.Scanner;

public class Ushtrimi1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int nr = 0;
		while(!(nr % 2 == 0 && nr > 4)){
			System.out.println("Shtyp nje numer cift > 4:");
			nr = sc.nextInt();
		}

		int [] vargu = new int[nr];

		for(int i = 0; i < vargu.length; i++){
			System.out.println("Shtyp nje numer:");
			vargu[i] = sc.nextInt();
		}	

		System.out.println("Jane shtypur gjithsej " + nr 
			+ " numra dhe numri me i madh tek eshte:" + findBiggestOdd(vargu));
	}

	public static int findBiggestOdd(int [] vargu){
		int nrMMV = 0;

		for(int i = 0; i < vargu.length; i++){
			if(nrMMV == 0 || (vargu[i] % 2 != 0 && nrMMV < vargu[i])){
				nrMMV = vargu[i];
			}
		}

		return nrMMV;
	}
}