public class VHS extends Medium{

    private int spieldauer;
    private String qualitaet;



    public VHS(String titel, double wert, String standort, int spieldauer, String qualitaet) {
        super(titel, wert, standort);
        this.spieldauer = spieldauer;
        this.qualitaet = qualitaet;
    }


    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public String getQualitaet() {
        return qualitaet;
    }

    public void setQualitaet(String qualitaet) {
        this.qualitaet = qualitaet;
    }

    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("VHS: Titel -> " + this.getTitel() + ", Wert -> " + this.getWert() + ", Standort -> " + this.getStandort() + ", Spieldauer -> " + this.spieldauer + ", Qualitaet -> " + this.qualitaet);
    }
}
