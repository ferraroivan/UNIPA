package phone;

public class Main{
    public static void main(String[] args){
        try{
            ListaDispositivo lista = new ListaDispositivo();
            Telefono t1 = new Telefono(12,"Apple","3G");
            Telefono t2 = new Telefono(12,"Apple","3G");
            Telefono t3 = new Telefono(14,"Samsung","5G");
            Smartphone s1 = new Smartphone(89, "Apple", "5G", "iOS");
            Smartphone s2 = new Smartphone(89, "Motorola", "2G", "Android");
            Smartphone s3 = new Smartphone(89, "Apple", "5G", "iOS");
            System.out.println("S1 and S2 are equal? " + s1.equals(s2));
            System.out.println("T1 and T2 are equal? " + s1.equals(s2));
            System.out.println("T1 hashcode: " + t1.hashCode());
            System.out.println("S1 hashcode: " + s1.hashCode());
            lista.inserisciLista1(t1);
            lista.inserisciLista1(t2);
            lista.inserisciLista2(t3);
            lista.inserisciLista1(s1);
            lista.inserisciLista2(s2);
            lista.inserisciLista1(s3);
            lista.checkApple();
            lista.smartphoneCounter();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}