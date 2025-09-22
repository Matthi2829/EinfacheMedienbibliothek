public class Cartridge extends Medium {

    private boolean vollstaendigesSet;
    private String Entwicklerstudio;
    private Konsolentyp konsole;


    public Cartridge(String titel, double wert, String standort, boolean vollstaendigesSet, String entwicklerstudio, Konsolentyp konsole) {
        super(titel, wert, standort);
        this.vollstaendigesSet = vollstaendigesSet;
        Entwicklerstudio = entwicklerstudio;
        this.konsole = konsole;
    }

    public boolean isVollstaendigesSet() {
        return vollstaendigesSet;
    }

    public void setVollstaendigesSet(boolean vollstaendigesSet) {
        this.vollstaendigesSet = vollstaendigesSet;
    }

    public String getEntwicklerstudio() {
        return Entwicklerstudio;
    }

    public void setEntwicklerstudio(String entwicklerstudio) {
        Entwicklerstudio = entwicklerstudio;
    }

    public Konsolentyp getKonsole() {
        return konsole;
    }

    public void setKonsole(Konsolentyp konsole) {
        this.konsole = konsole;
    }

    public void anzeigen()
    {
        super.anzeigen();
        System.out.println("Cartridge: Titel -> " + this.getTitel() + ", Wert -> " + this.getWert() + ", Standort -> " + this.getStandort() + ", Vollstaendiges Set -> " + this.vollstaendigesSet + ", Entwicklerstudio -> " + this.Entwicklerstudio + ", Konsole -> " + this.konsole);
    }
}
