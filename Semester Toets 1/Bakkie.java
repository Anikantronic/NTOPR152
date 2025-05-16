public class Bakkie extends Voertuig { //Extends laat Bakkie, Voertuig dan gebruik as 'n Super klas
    
    private double vragkapasiteit;

    public Bakkie(){ //Default konstrukteur
        super(); //Roep die Super klas se default konstrukteur
        setVragkapasiteit(0.0);
    }

    public Bakkie(String brandstoftipe, String vervaardiger, String Model, int[] ratverhoudings, double vragkapasiteit){ //Geparametiriseerde konstrukteur
        super(brandstoftipe, vervaardiger, Model, ratverhoudings); //Roep die Super klas se Geparametiriseerde konstrukteur
        setVragkapasiteit(vragkapasiteit);
    }

    @Override //Override die abstract metodes wat die Sub klas moet gebruik vanaf die Super Klas
    public double berekenGemRatverhouding(int[] ratverhoudings){

        double gemRatverhouding = 0.0;
        for(int i=0; i<ratverhoudings.length; i++){
            gemRatverhouding += ratverhoudings[i]; //Sommeer die ratte se heelgetal waardes
        }
        gemRatverhouding = gemRatverhouding/ratverhoudings.length; //Om die gemiddeld te kry van die aantal ratte

        return gemRatverhouding;
    }

    @Override //Override die abstract metodes wat die Sub klas moet gebruik vanaf die Super Klas
    public double maksimumSpoed(){ //Bereken die maksimum spoed volgens die formule gegee
        double maksimumSpoed = 180 - (getVragkapasiteit()*10) + (8*berekenGemRatverhouding(super.getRatverhoudings()) - (getVragkapasiteit()*berekenGemRatverhouding(super.getRatverhoudings())));

        return maksimumSpoed;
    }

    @Override
    public String toString(){ //Voeg nou die ekstra inligting by wat uniek is aan Bakkies en die berekende maksimum spoed
        return super.toString()+"\nBakkie se Vragkapasiteit: "+getVragkapasiteit()+"\nMaksimum Spoed van Bakkie: "+maksimumSpoed()+" km/h";
    }

    //Set metode vir unieke eienskap
    public void setVragkapasiteit(double vragkapasiteit){
        this.vragkapasiteit = vragkapasiteit;
    }
    //Get metode vir unieke eienskap
    public double getVragkapasiteit(){
        return vragkapasiteit;
    }

}
