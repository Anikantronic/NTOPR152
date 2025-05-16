import java.nio.file.*;
import java.util.Scanner;

public class PadInligting {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     
        System.out.print("Voer in die lêerpad in: ");
        String leerPad = scanner.nextLine();

        Path pad = Paths.get(leerPad);

        System.out.println("Absolute pad: "+pad.toAbsolutePath());
        System.out.println("Naam van lêer: "+pad.getFileName());
        System.out.println("Ouerdirectory: "+pad.getParent());
        System.out.println("Aantal Komponente: "+pad.getNameCount());

        for(int i=0; i<pad.getNameCount(); i++){
            System.out.println("Komponent "+(i+1)+" se naam is: "+pad.getName(i));
        }

    }
    
}
