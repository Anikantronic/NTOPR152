public class Motor extends Voertuig{ //Extends laat Motor, Voertuig dan gebruik as 'n Super klas

    private int sitplekke; //Ekstra eienskap uniek aan Motor's

    public Motor(){ //Default konstrukteur
        super(); //Roep die Super klas se default konstrukteur
        setSitplekke(0);
    }

    public Motor(String brandstoftipe, String vervaardiger, String Model, int[] ratverhoudings, int sitplekke){ //Geparametiriseerde Konstrukteur
        super(brandstoftipe, vervaardiger, Model, ratverhoudings); //Roep die super klas se Geparametiriseerde konstrukteur
        setSitplekke(sitplekke);        
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
        double maksimumSpoed = 200 - (getSitplekke()*5) + (10*berekenGemRatverhouding(super.getRatverhoudings()));

        return maksimumSpoed;
    }

    @Override
    public String toString(){ //Voeg nou die ekstra inligting by wat uniek is aan Motor's en die berekende maksimum spoed
        return super.toString()+"\nAantal sitplekke in Motor: "+getSitplekke()+"\nMaksimum Spoed van Motor: "+maksimumSpoed()+" km/h";
    }

    //Set metode vir unieke eienskap
    public void setSitplekke(int sitplekke){
        this.sitplekke = sitplekke;
    }
    //Get metode vir unieke eienskap
    public int getSitplekke(){
        return sitplekke;
    }
    
}
