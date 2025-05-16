import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.nio.file.*;

public class SkryfKliëntInligting {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Path pad = Paths.get("Kliënte.txt");

        int klientID;
        String klientNaam;
        String klientEposadres;
        final String skeiding = " ";
        String klientData;
        System.out.println("Welkom, voer in 0 by Kliënt ID om program te stop.");

        if(pad.toFile().exists()){

            try {

                OutputStream uitvoer = new BufferedOutputStream(Files.newOutputStream(pad, APPEND));
    
                System.out.print("Voer in Kliënt ID in:");
                klientID = scanner.nextInt();
                scanner.nextLine();
                while(klientID != 0){
    
                    System.out.print("Voer in die Kliëntnaam: ");
                    klientNaam = scanner.nextLine();
                    System.out.print("Voer in die Kliënt se e-posadres: ");
                    klientEposadres = scanner.nextLine();
    
                    klientData = klientID+skeiding+klientNaam+skeiding+klientEposadres;
                    byte[] data = (klientData+System.lineSeparator()).getBytes();
                    uitvoer.write(data);

                    System.out.print("Voer in Kliënt ID in:");
                    klientID = scanner.nextInt();
                    scanner.nextLine();
    
                }
                uitvoer.flush();
                uitvoer.close();
    
    
            } catch (IOException e) {
                System.out.println("I/O uitsondering: "+e);
            } catch (Exception m){
                System.out.println("Voer 'n geldige waarde in asb.");
            }

        } else {

            try {

                OutputStream uitvoer = new BufferedOutputStream(Files.newOutputStream(pad, CREATE));
    
                System.out.print("Voer in Kliënt ID in:");
                klientID = scanner.nextInt();
                scanner.nextLine();
                while(klientID != 0){
    
                    System.out.print("Voer in die Kliëntnaam: ");
                    klientNaam = scanner.nextLine();
                    System.out.print("Voer in die Kliënt se e-posadres: ");
                    klientEposadres = scanner.nextLine();
    
                    klientData = klientID+skeiding+klientNaam+skeiding+klientEposadres;
                    byte[] data = klientData.getBytes();
                    uitvoer.write(data);
                }
                uitvoer.flush();
                uitvoer.close();
    
    
            } catch (IOException e) {
                System.out.println("I/O uitsondering: "+e);
            }

        }

    }

}
