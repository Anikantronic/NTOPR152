import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class LeesPunte {
    
    public static void main(String[] args) {
        
        Path pad = Paths.get("Studente.txt");
        String lyn = "";
        InputStream invoer = null;

        try {
            invoer = new BufferedInputStream(Files.newInputStream(pad, READ));
            BufferedReader lesser = new BufferedReader(Files.newBufferedReader(pad));
            lyn = lesser.readLine();

            while(lyn != null){
                System.out.println(lyn);
                lyn = lesser.readLine();
            }
            invoer.close();
            
        } catch (IOException e) {
            System.out.println("I/O uitsondering: "+e);
        }

    }

}
