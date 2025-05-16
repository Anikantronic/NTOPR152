import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class StudentePunte {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Path pad = Paths.get("Studente.txt");

        if(pad.toFile().exists()){
            System.out.print("Voer in die Student se naam: ");
            String naam = scanner.nextLine();
            System.out.print("Voer die Toetspunt in: ");
            double toetspunt = scanner.nextDouble();
            scanner.nextLine();
            String studentData = "Naam:"+naam+", Punt:"+toetspunt;

            byte[] data = (studentData+System.lineSeparator()).getBytes();
            OutputStream uitvoer = null;

            try {
                uitvoer = new BufferedOutputStream(Files.newOutputStream(pad, APPEND));
                uitvoer.write(data);
                uitvoer.flush();
                uitvoer.close();
                System.out.println("Student se naam en toetspunt is bygevoeg.");

            } catch (IOException e) {
                System.out.println("I/O uitsondering: "+e);
            }   

        } else {
            String nuut = "Nuwe file is geskep";
            byte[] data = (nuut+System.lineSeparator()).getBytes();
            OutputStream uitvoer = null;
            try {
                uitvoer = new BufferedOutputStream(Files.newOutputStream(pad, CREATE));
                uitvoer.write(data);
                uitvoer.flush();
                uitvoer.close();

                System.out.println("Die file is nou geskep.");
                    
            } catch (IOException e) {
                System.out.println("I/O uitsodering: "+e);
            } catch (Exception e){
                System.out.println("Fout Boodskap: "+e);
            }

        }

    }

}