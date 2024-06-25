import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Gps implements Observable{
    private List<Observateur> observateur;
    private String position;
    private String precision;
    private String date;

    public Gps(){
        this.observateur= new ArrayList<>();
    }

    @Override
    public void ajouterObservateur(Observateur o) {
        observateur.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        observateur.remove(o);
    }

    @Override
    public void notifierObservateur() {
            for (Observateur o : observateur) {
                o.update(position, precision, date);
            }
    }

    public void setPosition(String position) {
        this.position = position;
        notifierObservateur();
    }
    public void setPrecision(String precision){
        this.precision = precision;
        notifierObservateur();
    }
    public void setDate(String date){
        this.date = date;
        notifierObservateur();
    }

}
