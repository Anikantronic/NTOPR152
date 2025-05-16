import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class LeesSportspanne {

    public static void main(String[] args) {

        Path pad = Paths.get("Sportspanne.txt");

        String SpanID;
        String SpanNaam;
        double Gewenwedstryde;
        double Verloorwedstryde;

        double wenVerhouding = 0;
        double totaalwedstryde = 0;
        double gemidWenVerhouding = 0;
        int aantalSpanne = 0;

        String skeiding = ",";

        try {
            InputStream invoer = new BufferedInputStream(Files.newInputStream(pad, READ));
            BufferedReader lesser = new BufferedReader(new InputStreamReader(invoer));

            String lyn = lesser.readLine();

            while (lyn != null) {

                String[] data = lyn.split(skeiding);
                SpanID = data[0];

                if (SpanID.equals("0")) {
                    lyn = lesser.readLine();
                } else {
                    SpanNaam = data[1];
                    Gewenwedstryde = Double.parseDouble(data[2]);
                    Verloorwedstryde = Double.parseDouble(data[3]);
                    totaalwedstryde = Gewenwedstryde+Verloorwedstryde;
                    wenVerhouding = Gewenwedstryde/totaalwedstryde;

                    System.out.println();
                    System.out.println("ID-nommer: "+SpanID);
                    System.out.println("Naam: "+SpanNaam);
                    System.out.println("Aantal gewenwedstryde: "+Gewenwedstryde);
                    System.out.println("Aantal verloorwedstryde: "+Verloorwedstryde);
                    System.out.println("Wenverhouding: "+wenVerhouding);
                    gemidWenVerhouding += wenVerhouding;
                    aantalSpanne++;
                    lyn = lesser.readLine();
                }
            }
            System.out.println();
            System.out.println("Die gemiddelde wenverhouding is: "+(gemidWenVerhouding/aantalSpanne));


        } catch (IOException e) {
            System.out.println("I/O fout:"+e);
        }
        
    }
    
}
