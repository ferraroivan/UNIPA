package phone;
import java.util.Objects;

public class Smartphone extends Telefono{
    private String os;

    public Smartphone(int id, String descrizione, String rete, String os){
        super(id, descrizione, rete);
        setOS(os);
    }

    public void setOS(String os){
        
       if(os.equals("iOS")){
            this.os = os;
        } else if (os.equals("Android")){
            this.os = os;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public int getOperatingSystem(){
        return 1;
    }

    public String getOS(){
        return os;
    }

    public String toString(){
        return super.toString() + " OS: " + getOS();
    }

    public boolean equals(Object e){
        if (e == null){
            return false;
        }
        if (e instanceof Smartphone){
            Smartphone e2 = (Smartphone) e;
            return this.getOS().equals(e2.getOS()) && super.equals(e2);
        } else {
            return false;
        }
    }

    public int hashCode(){
        int counter = Objects.hashCode(os) + super.hashCode();
        return counter;
    }
}