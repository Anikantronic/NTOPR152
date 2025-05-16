import java.util.Scanner;

public class SomVan {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Voer in 'n string:");
        String nommers = scanner.nextLine();
        System.out.println("Som van syfers: "+teller(nommers, 0));
    }

    public static int teller(String nommers, int totaal){

        if(nommers == ""){
            return totaal;
        } else if(nommers.length() > 0){
            char karakter = nommers.charAt(nommers.length()-1);
            if(Character.isDigit(karakter)){
                totaal += Integer.parseInt(nommers.substring(nommers.length()-1, nommers.length()));
            }
            return teller(nommers.substring(0, nommers.length()-1), totaal);
        } else {
            return teller(nommers.substring(0, nommers.length()-1), totaal);
        }
    }
}