import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class LeesProdukte {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Path pad = Paths.get("Produkte.txt");

        String produkIDgegee;
        String produkID;
        String naam;
        double prys;
        String produkData;
        final String skeiding = ",";
        String[] data = new String[3];

        try {

            InputStream invoer = new BufferedInputStream(Files.newInputStream(pad, READ));
            BufferedReader lesser = new BufferedReader(new InputStreamReader(invoer));

            System.out.print("Voer in Produk ID: ");
            produkIDgegee = scanner.nextLine();
            
            do {
                produkData = lesser.readLine();
                data = produkData.split(skeiding);
                produkID = data[0];
                naam = data[1];
                prys = Double.parseDouble(data[2]);

            } while (!produkID.equalsIgnoreCase(produkIDgegee) || produkData == null);

            if(produkData != null){
                System.out.println("Produk ID: "+produkID+",Naam: "+naam+", Prys: R"+prys);
            }

            /*if (produkData == null) {
                System.out.println("Geen Produk ID gevind nie.");
            }*/
            
        } catch (Exception e) {
            System.out.println("Fout boodskap: "+e);
        }  
    }
}
