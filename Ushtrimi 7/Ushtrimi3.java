import java.util.Scanner;

public class Ushtrimi3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int totali;
		do{
			System.out.println("Shtyp madhesine e vargut (>=15):");
			totali = sc.nextInt();
		}while(totali < 15);

		int [] vargu = new int[totali];

		for(int i = 0; i < vargu.length; i++){
			System.out.println("Plotesojeni vargun me nje numer:");
			vargu[i] = sc.nextInt();
		}

		int [] numrat = findNumbers(vargu);
		int nrM = numrat[0];
		int nrV = numrat[1];

		System.out.println("Jane shtypur gjithsej " + 
			totali + " numra dhe numri më i madh është: " + nrM 
			+ ", ndërsa më i vogli: " + nrV);


	}

	public static int[] findNumbers(int [] v){
		int [] numrat = new int[2];
		int nrMadh = Integer.MIN_VALUE;
		int nrVogel = Integer.MAX_VALUE;

		for(int i = 0; i < v.length; i++){
			if(nrMadh < v[i]){
				nrMadh = v[i];
			}

			if(nrVogel > v[i]){
				nrVogel = v[i];
			}
			
		}

		numrat[0] = nrMadh;
		numrat[1] = nrVogel;

		return numrat;
	}


}