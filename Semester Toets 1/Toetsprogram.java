import java.util.Scanner; //Voer in die Scanner klas

public class Toetsprogram {

    public static Scanner invoer = new Scanner(System.in); //Skep Scanner om invoer te kan ontvang vanaf gebruiker

    public static void main(String[] args) {

        System.out.print("Hoeveel voertuie se inligting wil u invoer: ");
        int aantal = invoer.nextInt();

        //Skep skikking om voertuie in te stoor, van die grootte wat gebruiker soek
        Voertuig[] voertuie = new Voertuig[aantal];

        boolean stop = false;
        int teller = 0;
        while (!stop) { //Implimenteer 'n while loop om te help seker maak die regte hoeveelheid voertuie word geskep, as gebruiker verkeerde invoer gee om te kies tussen Motor en Bakkie

            System.out.println(" ");
            System.out.print("Will u 'n Motor(1) of Bakkie invoer(2): ");
            int voertuigTipe = invoer.nextInt();
            invoer.nextLine();

            //Switch case om te kan wissel tussen die tipe voertuig wat se inligting ingevoer word.
            switch (voertuigTipe) {
                case 1: //Motor
                    voertuie[teller] = kryMotorInligting();

                    teller++;
                    if(teller == aantal){
                        stop = true;
                    }
                    break;

                case 2: //Bakkie
                    voertuie[teller] = kryBakkieInligting();

                    teller++;
                    if(teller == aantal){
                        stop = true;
                    }
                    break;
            
                default: //Vir as verkeerde invoer gegee word
                    System.out.println("Voer asb 'n gelde keuse in.");
                    break;
            }
                 
        }

        //Vertoon nou die voertuie se inligting
        for(int i=0; i<aantal; i++){
            System.out.println(" ");
            System.out.println("Voertuig "+(i+1)+":");
            System.out.println(voertuie[i].toString());
        }
        
    }

    public static Motor kryMotorInligting(){ //Metode om 'n Motor se inligting te ontvang

        System.out.println("Voer in die Motor se inligting asb:");
        System.out.print("Brandstoftipe: ");
        String brandstoftipe = invoer.nextLine();
        System.out.print("Motor se Vervaardiger: ");
        String vervaardiger = invoer.nextLine();
        System.out.print("Model naam: ");
        String model = invoer.nextLine();

        System.out.print("Hoeveel ratte het die voertuig(Uitsluitend die agteruit rat): ");
        int aantalRatte = invoer.nextInt();
        int[] ratverhoudings = new int[aantalRatte];
        for(int i=0; i<aantalRatte; i++){ //Rat verhouding bestaan uit die hoeveelheid ratte wat 'n motor het vanaf 1 tot by die hoogste rat, bv 5
            ratverhoudings[i] = i+1; //Dus word die ratte net genommer van 1 tot die aantal ratte
        }

        System.out.print("Aantal sitplekke: ");
        int sitplekke = invoer.nextInt();
        invoer.nextLine();

        //Skep nou 'n Motor voorwerp
        return new Motor(brandstoftipe, vervaardiger, model, ratverhoudings, sitplekke);
    }
    
    public static Bakkie kryBakkieInligting(){ //Metode om 'n Bakkie se inligting te ontvang

        System.out.println("Voer in die Motor se inligting asb:");
        System.out.print("Brandstoftipe: ");
        String brandstoftipe = invoer.nextLine();
        System.out.print("Motor se Vervaardiger: ");
        String vervaardiger = invoer.nextLine();
        System.out.print("Model naam: ");
        String model = invoer.nextLine();

        System.out.print("Hoeveel ratte het die voertuig(Uitsluitend die agteruit rat): ");
        int aantalRatte = invoer.nextInt();
        int[] ratverhoudings = new int[aantalRatte];
        for(int i=0; i<aantalRatte; i++){ //Rat verhouding bestaan uit die hoeveelheid ratte wat 'n motor het vanaf 1 tot by die hoogste rat, bv 5
            ratverhoudings[i] = i+1; //Dus word die ratte net genommer van 1 tot die aantal ratte
        }  

        System.out.print("Vragkapasiteit: ");
        double vragkapasiteit = invoer.nextDouble();
        invoer.nextLine();

        //Skep nou 'n Bakkie voorwerp
        return new Bakkie(brandstoftipe, vervaardiger, model, ratverhoudings, vragkapasiteit);
    }
}
