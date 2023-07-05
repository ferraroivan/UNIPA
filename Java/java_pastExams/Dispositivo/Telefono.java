package phone;
import java.util.Objects;
public class Telefono extends Dispositivo{
    private String rete;

    public Telefono(int id, String descrizione, String rete){
        setID(id);
        setDescrizione(descrizione);
        setRete(rete);
    }

    public void setRete(String rete){
        if(rete.equals("2G")){
                this.rete = rete;
        } else if(rete.equals("3G")){
                this.rete = rete;            
        } else if(rete.equals("4G")){
                this.rete = rete;
        } else if(rete.equals("5G")){
            this.rete = rete;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public int getOperatingSystem(){
        return 0;
    }
    public String getRete(){
        return rete;
    }

    public String toString(){
        return super.toString() + " Rete: " + getRete();
    }

    public boolean equals(Object t){
        if(t == null){
            return false;
        }
        if (t instanceof Telefono){
            Telefono t2 = (Telefono) t;
            return this.getRete().equals(t2.getRete()) && super.equals(t2);
        } else {
            return false;
        }
    }

    public int hashCode(){
        int counter = Objects.hashCode(rete) + super.hashCode();
        return counter;
    }
}