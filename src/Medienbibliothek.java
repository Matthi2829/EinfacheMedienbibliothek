import java.util.ArrayList;

public class Medienbibliothek {

    private ArrayList<Medium> medienListe;


    public Medienbibliothek() {
        this.medienListe = new ArrayList<>();
    }


    public void mediumHinzufuegen (Medium m)
    {
        this.medienListe.add(m);
    }

    public void alleMedienAnzeigen()
    {
        for (Medium m : this.medienListe)
        {
            m.anzeigen();
        }
    }
}
