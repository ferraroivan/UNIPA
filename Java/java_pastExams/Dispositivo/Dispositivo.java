package phone;
import java.util.Objects;

public abstract class Dispositivo{
    private int id;
    private String descrizione;

    public void setID(int id){
        this.id = id;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public int getOperatingSystem(){
        return 0;
    }

    public int getID(){
        return id;
    }
    public String getDescrizione(){
        return descrizione;
    }

    public String toString(){
        return "ID: " + getID() + " Descrizione: " + getDescrizione();
    }
    public boolean equals(Object d){
        if (d == null){
            return false;
        }
        if (d instanceof Dispositivo){
            Dispositivo d2 = (Dispositivo) d;
            return this.getID() == d2.getID() && this.getDescrizione().equals(d2.getDescrizione());
        } else {
            return false;
        }
    }

    public int hashCode(){
        int counter = 0;
        counter = Objects.hashCode(id) + Objects.hashCode(descrizione);
        return counter;
    }

}