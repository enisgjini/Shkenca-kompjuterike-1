import java.util.Scanner;

public class Ushtrimi3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int nr;
		do{
			System.out.println("Shtyp nje numer > 12:");
			nr = sc.nextInt();
		}while(nr < 12);

		byte [] vargu = new byte[nr];

		for(int i = 0; i < vargu.length; i++){
			System.out.println("Shtyp nje numer:");
			vargu[i] = sc.nextByte();
		}	

		System.out.println("Jane shtypur gjithsej " + nr 
			+ " numra dhe  perqindja e numrave cift te plotpjesetueshem me 6: " 
			+ findNumbers(vargu));
	}

	public static double findNumbers(byte [] vargu){
		int count = 0;

		for(int i = 0; i < vargu.length; i++){
			if(vargu[i] % 6 == 0){
				count++;
			}
		}

		return (double)count * 100/vargu.length;
	}
}