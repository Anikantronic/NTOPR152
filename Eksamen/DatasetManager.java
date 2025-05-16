import java.util.*;

public class DatasetManager {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        LinkedList<Dataset> datastelle = new LinkedList<Dataset>();

        boolean stop = false;
        final String SENTINEL = "stop";

        while (!stop) {

            System.out.print("Voer in die Datastel naam of 'stop' om die program te eindig: ");
            String datastelNaam = scanner.nextLine();

            if(datastelNaam.equalsIgnoreCase(SENTINEL)){
                stop = true;
            } else {
                System.out.print("Grootte in gigagrepe: ");
                double grootte = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Aantal datapunte: ");
                int datapunte = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kategorie beskrywing: ");
                String beskrywing = scanner.nextLine();

                datastelle.add(new Dataset(datastelNaam, grootte, datapunte, beskrywing));
            }
            
        }

        Collections.sort(datastelle);

        for (Dataset dataset : datastelle) {
            System.out.println(dataset.toString());
        }
        System.out.println();
        System.out.print("Watter kategorie wil u verwyder: ");
        String verwyder = scanner.nextLine();

        for(int i=0; i<datastelle.size(); i++){
            if (datastelle.get(i).getBeskrywing().equalsIgnoreCase(verwyder)) {
                datastelle.remove(i);
            }
        }

        System.out.println(verwyder+" is nou verwyder.");
        System.out.println("Hierop volg die opgedateerde lys.");
        for (Dataset dataset : datastelle) {
            System.out.println(dataset.toString());
        }        

    }

}