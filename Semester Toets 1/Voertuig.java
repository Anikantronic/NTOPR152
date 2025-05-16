public abstract class Voertuig {

    //Algemene Eienskappe
    private String brandstoftipe;
    private String vervaardiger;
    private String model;
    private int[] ratverhoudings;

    public Voertuig(){ //Default konstukteur
        setBrandstoftipe("");
        setVervaardiger("");
        setModel("");
    }

    public Voertuig(String brandstoftipe, String vervaardiger, String Model, int[] ratverhoudings){ //Geparameteriseerde konstrukteur
        setBrandstoftipe(brandstoftipe);
        setVervaardiger(vervaardiger);
        setModel(Model);
        setRatverhoudings(ratverhoudings);
    }

    abstract double berekenGemRatverhouding(int[] ratverhoudings); //Abstract klas vir die berekening van die Gemiddelde Rat verhouding

    abstract double maksimumSpoed(); //Abstract klass vir die berekening van die maksimum spoed

    @Override //Override die toString metode, en begin die string van inligting oor die voertuig
    public String toString(){
        return "Voertuig Vervaardiger: "+getVervaardiger()+"\nModel Naam: "+getModel()+"\nBrandstoftipe: "+getBrandstoftipe();
    }
    
    //Set metodes
    public void setBrandstoftipe(String brandstoftipe){
        this.brandstoftipe = brandstoftipe;
    }

    public void setVervaardiger(String vervaardiger){
        this.vervaardiger = vervaardiger;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setRatverhoudings(int[] ratverhoudings){
        this.ratverhoudings = ratverhoudings;
    }

    //Get metodes
    public String getBrandstoftipe(){
        return brandstoftipe;
    }

    public String getVervaardiger(){
        return vervaardiger;
    }

    public String getModel(){
        return model;
    }

    public int[] getRatverhoudings(){
        return ratverhoudings;
    }

}
