package phone;
import java.util.ArrayList;

public class ListaDispositivo{
    ArrayList<Dispositivo> lista1 = new ArrayList<>();
    ArrayList<Dispositivo> lista2 = new ArrayList<>();

    public ListaDispositivo(){

    }

    public void inserisciLista1(Dispositivo d){
        lista1.add(d);
    }
    public void inserisciLista2(Dispositivo d){
        lista2.add(d);
    }
    public void checkApple(){
        int counter = 0;
        if(lista1.contains("Apple") || lista2.contains("Apple")){
            counter++;
        }
        System.out.println("There are " + counter + " Apple devices");
    }

    public void smartphoneCounter(){
        int counter = 0;
        for(int i = 0;i<lista1.size();i++){
            if(lista1.get(i).getOperatingSystem() == 1){
                counter++;
            }
        }
        for(int i = 0;i<lista2.size();i++){
            if(lista2.get(i).getOperatingSystem() == 1){
                counter++;
            }
        }
        System.out.println("There are " + counter + " Smartphones");
    }
}