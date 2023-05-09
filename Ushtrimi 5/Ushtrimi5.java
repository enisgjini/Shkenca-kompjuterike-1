import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Udhëzo shfrytëzuesin të shtypë numrin e fjalëve/fjalive
        // derisa inputi nuk është së paku 10
        int numriFjaleve = 0;
        do
        {
            System.out.print("Shtyp numrin e fjaleve/fjalive (minimumi është 10): ");
            numriFjaleve = input.nextInt();
        }
        while (numriFjaleve < 10);
        
        // Plotëso vargun me fjalë/fjali nga shfrytëzuesi
        String[] varguFjaleve = new String[numriFjaleve];
        for (int i = 0; i < numriFjaleve; i++) {
            System.out.print("Shtyp fjalinë/fjalën : ");
            varguFjaleve[i] = input.next();
        }
        input.nextLine();
        // Numeroni fjalët/fjalitë me kushtet e përcaktuara
        int numriFjaleveKusht = numeroFjalen(varguFjaleve);
        int numriFjaleveJoKusht = numriFjaleve - numriFjaleveKusht;
        
        // Shfaqni rezultatin
        System.out.println("Jane shtypur gjithsej " + numriFjaleve + " fjale/fjalidhe " + numriFjaleveKusht + " prej tyre e plotesojne kushtin.");
    }
    
    public static int numeroFjalen(String[] varguFjaleve) {
        int numriFjaleveKusht = 0;
        for (int i = 0; i < varguFjaleve.length; i++) {
            String fjala = varguFjaleve[i];
            int gjatesia = fjala.length();
            boolean kaZanore = false;
            
            // Kontrollo nese fjalës/fjalive i mungon ndonjë zanor
            for (int j = 0; j < gjatesia; j++) {
                char karakteri = fjala.charAt(j);
                if (karakteri == 'a' || karakteri == 'e' || karakteri == 'i' || karakteri == 'o' || karakteri == 'u' || karakteri == 'y') {
                    kaZanore = true;
                    break;
                }
            }
            
            // Shto fjalën/fjalitë në numrin total të fjalëve/fjalive që plotësojnë kushtin
            if (!kaZanore && gjatesia >= 4 && gjatesia <= 8) {
                numriFjaleveKusht++;
            }
        }
        return numriFjaleveKusht;
    }
}
