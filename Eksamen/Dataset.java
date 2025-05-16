public class Dataset implements Comparable<Dataset>{

    private String naamVanDatastel;
    private double datastelGrootte;
    private int aantalDatapunte;
    private String beskrywing;

    public Dataset(String naamVanDatastel, double datastelGrootte, int aantalDatapunte, String beskrywing){

        setNaamVanDatastel(naamVanDatastel);
        setDatastelGrootte(datastelGrootte);
        setAantalDatapunte(aantalDatapunte);
        setBeskrywing(beskrywing);
    }

    @Override
    public String toString(){
        return "\nDatastel Naam: "+getNaamVanDatastel()+"\nDatastel Grootte: "+getDatastelGrootte()+"\nAantal Datapunte: "+getAantalDatapunte()+"\nKategorie: "+getBeskrywing();
    }

    @Override
    public int compareTo(Dataset o) {
        if(datastelGrootte > o.getDatastelGrootte()){
            return 1;
        } else if(datastelGrootte == o.getDatastelGrootte()){
            return 0;
        } else {
            return -1;
        }
    }

    public void setNaamVanDatastel(String naamVanDatastel) {
        this.naamVanDatastel = naamVanDatastel;
    }

    public void setDatastelGrootte(double datastelGrootte) {
        this.datastelGrootte = datastelGrootte;
    }

    public void setAantalDatapunte(int aantalDatapunte) {
        this.aantalDatapunte = aantalDatapunte;
    }

    public void setBeskrywing(String beskrywing) {
        this.beskrywing = beskrywing;
    }

    public String getNaamVanDatastel() {
        return naamVanDatastel;
    }

    public double getDatastelGrootte() {
        return datastelGrootte;
    }

    public int getAantalDatapunte() {
        return aantalDatapunte;
    }

    public String getBeskrywing() {
        return beskrywing;
    }
    
}
